/*******************************************************************************
 * Copyright (c) 2017 Lablicate GmbH.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Wenig - initial API and implementation
 *******************************************************************************/
package org.eclipse.eavp.service.swtchart.demos.parts;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;

import org.eclipse.eavp.service.swtchart.core.IChartSettings;
import org.eclipse.eavp.service.swtchart.core.IPrimaryAxisSettings;
import org.eclipse.eavp.service.swtchart.core.ISeriesData;
import org.eclipse.eavp.service.swtchart.demos.support.SeriesConverter;
import org.eclipse.eavp.service.swtchart.linecharts.ILineSeriesData;
import org.eclipse.eavp.service.swtchart.linecharts.ILineSeriesSettings;
import org.eclipse.eavp.service.swtchart.linecharts.LineChart;
import org.eclipse.eavp.service.swtchart.linecharts.LineSeriesData;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.swtchart.ILineSeries.PlotSymbolType;
import org.swtchart.LineStyle;

public class MeasurementSeries_2_Part extends LineChart {

	@Inject
	public MeasurementSeries_2_Part(Composite parent) {
		super(parent, SWT.NONE);
		setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
		try {
			initialize();
		} catch(Exception e) {
			System.out.println(e);
		}
	}

	private void initialize() throws Exception {

		/*
		 * Chart Settings
		 */
		IChartSettings chartSettings = getChartSettings();
		chartSettings.setOrientation(SWT.HORIZONTAL);
		chartSettings.setHorizontalSliderVisible(true);
		chartSettings.setVerticalSliderVisible(false);
		chartSettings.getRangeRestriction().setZeroX(true);
		chartSettings.getRangeRestriction().setZeroY(true);
		chartSettings.setCreateMenu(true);
		/*
		 * Primary X-Axis
		 */
		IPrimaryAxisSettings primaryAxisSettingsX = chartSettings.getPrimaryAxisSettingsX();
		primaryAxisSettingsX.setTitle("Concentration [mg/g]");
		primaryAxisSettingsX.setDecimalFormat(new DecimalFormat(("0.00"), new DecimalFormatSymbols(Locale.ENGLISH)));
		primaryAxisSettingsX.setColor(Display.getDefault().getSystemColor(SWT.COLOR_BLACK));
		primaryAxisSettingsX.setGridLineStyle(LineStyle.DOT);
		/*
		 * Primary Y-Axis
		 */
		IPrimaryAxisSettings primaryAxisSettingsY = chartSettings.getPrimaryAxisSettingsY();
		primaryAxisSettingsY.setTitle("Area");
		primaryAxisSettingsY.setDecimalFormat(new DecimalFormat(("0.00"), new DecimalFormatSymbols(Locale.ENGLISH)));
		primaryAxisSettingsY.setColor(Display.getDefault().getSystemColor(SWT.COLOR_BLACK));
		primaryAxisSettingsY.setGridLineStyle(LineStyle.DOT);
		//
		applySettings(chartSettings);
		/*
		 * Create series.
		 */
		Map<Integer, Color> colors = new HashMap<Integer, Color>();
		colors.put(1, Display.getDefault().getSystemColor(SWT.COLOR_BLACK));
		colors.put(2, Display.getDefault().getSystemColor(SWT.COLOR_RED));
		colors.put(3, Display.getDefault().getSystemColor(SWT.COLOR_GRAY));
		//
		List<ILineSeriesData> lineSeriesDataList = new ArrayList<ILineSeriesData>();
		ISeriesData seriesData;
		ILineSeriesData lineSeriesData;
		ILineSeriesSettings lineSerieSettings;
		//
		for(int i = 1; i <= 3; i++) {
			/*
			 * Readings
			 */
			seriesData = SeriesConverter.getSeriesXY("Measurement2_Readings_" + i);
			lineSeriesData = new LineSeriesData(seriesData);
			lineSerieSettings = lineSeriesData.getLineSeriesSettings();
			lineSerieSettings.setEnableArea(false);
			lineSerieSettings.setLineStyle(LineStyle.NONE);
			lineSerieSettings.setSymbolSize(5);
			lineSerieSettings.setSymbolColor(colors.get(i));
			lineSerieSettings.setSymbolType(PlotSymbolType.CIRCLE);
			lineSeriesDataList.add(lineSeriesData);
			/*
			 * Regression
			 */
			seriesData = SeriesConverter.getSeriesXY("Measurement2_Regression_" + i);
			lineSeriesData = new LineSeriesData(seriesData);
			lineSerieSettings = lineSeriesData.getLineSeriesSettings();
			lineSerieSettings.setEnableArea(false);
			lineSerieSettings.setLineStyle(LineStyle.SOLID);
			lineSerieSettings.setLineColor(colors.get(i));
			lineSerieSettings.setSymbolType(PlotSymbolType.NONE);
			lineSeriesDataList.add(lineSeriesData);
		}
		/*
		 * Set series.
		 */
		addSeriesData(lineSeriesDataList);
	}
}
