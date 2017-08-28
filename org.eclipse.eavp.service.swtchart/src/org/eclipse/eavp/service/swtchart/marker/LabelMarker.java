/*******************************************************************************
 * Copyright (c) 2017 Lablicate GmbH.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Dr. Philip Wenig - initial API and implementation
 *******************************************************************************/
package org.eclipse.eavp.service.swtchart.marker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.eavp.service.swtchart.core.BaseChart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.graphics.Transform;
import org.eclipse.swt.widgets.Display;
import org.swtchart.ISeries;

public class LabelMarker extends AbstractBaseChartPaintListener implements IBaseChartPaintListener {

	private Transform transform = null;
	private Map<Integer, String> labels = new HashMap<Integer, String>();
	private int indexSeries = -1;

	public LabelMarker(BaseChart baseChart) {
		super(baseChart);
	}

	public void setLabels(List<String> labels, int indexSeries, int orientation) {

		Map<Integer, String> labelsMap = new HashMap<Integer, String>();
		int index = 0;
		for(String label : labels) {
			labelsMap.put(index++, label);
		}
		setLabels(labelsMap, indexSeries, orientation);
	}

	public void setLabels(Map<Integer, String> labels, int indexSeries, int orientation) {

		this.labels = (labels != null) ? labels : new HashMap<Integer, String>();
		this.indexSeries = indexSeries;
		if(orientation == SWT.VERTICAL) {
			transform = new Transform(Display.getDefault());
			transform.rotate(-90);
		} else {
			transform = null;
		}
	}

	@Override
	public void paintControl(PaintEvent e) {

		BaseChart baseChart = getBaseChart();
		Rectangle rectangle = baseChart.getPlotArea().getClientArea();
		ISeries[] series = baseChart.getSeriesSet().getSeries();
		if(indexSeries >= 0 && indexSeries < series.length) {
			ISeries serie = series[indexSeries];
			for(int i : labels.keySet()) {
				/*
				 * Draw the label
				 */
				String label = labels.get(i);
				Point point = serie.getPixelCoordinates(i);
				//
				if(rectangle.contains(point)) {
					/*
					 * Calculate x and y
					 */
					int x;
					int y;
					Point labelSize = e.gc.textExtent(label);
					GC gc = e.gc;
					if(transform != null) {
						gc.setTransform(transform);
						x = -labelSize.x - (point.y - labelSize.x - 15);
						y = point.x - (labelSize.y / 2);
					} else {
						x = point.x - labelSize.x / 2;
						y = point.y - labelSize.y - 15;
					}
					gc.drawText(label, x, y, true);
					gc.setTransform(null);
				}
			}
		}
	}
}
