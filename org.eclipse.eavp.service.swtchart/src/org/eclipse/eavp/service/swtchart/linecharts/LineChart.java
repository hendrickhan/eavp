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
package org.eclipse.eavp.service.swtchart.linecharts;

import java.util.List;

import org.eclipse.eavp.service.swtchart.core.BaseChart;
import org.eclipse.eavp.service.swtchart.core.ISeriesData;
import org.eclipse.eavp.service.swtchart.core.ScrollableChart;
import org.eclipse.eavp.service.swtchart.core.SeriesContainer;
import org.eclipse.eavp.service.swtchart.exceptions.SeriesException;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.swtchart.ILineSeries;
import org.swtchart.ISeries.SeriesType;

public class LineChart extends ScrollableChart {

	private static final int DISPLAY_WIDTH = Display.getDefault().getClientArea().width;
	//
	public static final int HIGH_COMPRESSION = DISPLAY_WIDTH * 2;
	public static final int MEDIUM_COMPRESSION = DISPLAY_WIDTH * 5;
	public static final int LOW_COMPRESSION = DISPLAY_WIDTH * 10;
	public static final int NO_COMPRESSION = Integer.MAX_VALUE;

	public LineChart(Composite parent, int style) {
		super(parent, style);
	}

	public void addSeriesData(List<ILineSeriesData> lineSeriesDataList) {

		addSeriesData(lineSeriesDataList, NO_COMPRESSION);
	}

	/**
	 * The data is compressed to the given length.
	 * If you're unsure which length to set, then use one of the following variables:
	 * 
	 * HIGH_COMPRESSION
	 * MEDIUM_COMPRESSION
	 * LOW_COMPRESSION
	 * NO_COMPRESSION
	 * 
	 * @param lineSeriesDataList
	 * @param compressToLength
	 */
	public void addSeriesData(List<ILineSeriesData> lineSeriesDataList, int compressToLength) {

		/*
		 * Suspend the update when adding new data to improve the performance.
		 */
		if(lineSeriesDataList != null && lineSeriesDataList.size() > 0) {
			BaseChart baseChart = getBaseChart();
			baseChart.suspendUpdate(true);
			for(ILineSeriesData lineSeriesData : lineSeriesDataList) {
				/*
				 * Get the series data and apply the settings.
				 */
				try {
					ISeriesData seriesData = lineSeriesData.getSeriesData();
					SeriesContainer seriesContainer = calculateSeries(seriesData.getXSeries(), seriesData.getYSeries(), compressToLength);
					ILineSeries lineSeries = (ILineSeries)createSeries(SeriesType.LINE, seriesContainer.getXSeries(), seriesContainer.getYSeries(), seriesData.getId());
					//
					ILineSeriesSettings lineSeriesSettings = lineSeriesData.getLineSeriesSettings();
					lineSeries.setDescription(lineSeriesSettings.getDescription());
					lineSeries.setVisible(lineSeriesSettings.isVisible());
					lineSeries.setVisibleInLegend(lineSeriesSettings.isVisibleInLegend());
					lineSeries.setAntialias(lineSeriesSettings.getAntialias());
					lineSeries.enableArea(lineSeriesSettings.isEnableArea());
					lineSeries.setSymbolType(lineSeriesSettings.getSymbolType());
					lineSeries.setSymbolSize(lineSeriesSettings.getSymbolSize());
					lineSeries.setSymbolColor(lineSeriesSettings.getSymbolColor());
					lineSeries.setLineColor(lineSeriesSettings.getLineColor());
					lineSeries.setLineWidth(lineSeriesSettings.getLineWidth());
					lineSeries.enableStack(lineSeriesSettings.isEnableStack());
					lineSeries.enableStep(lineSeriesSettings.isEnableStep());
					lineSeries.setLineStyle(lineSeriesSettings.getLineStyle());
				} catch(SeriesException e) {
					//
				}
			}
			baseChart.suspendUpdate(false);
			adjustRange(true);
			baseChart.redraw();
		}
	}
}
