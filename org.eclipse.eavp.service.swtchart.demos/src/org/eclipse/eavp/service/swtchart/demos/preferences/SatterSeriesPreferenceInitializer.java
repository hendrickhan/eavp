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
package org.eclipse.eavp.service.swtchart.demos.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.eavp.service.swtchart.demos.Activator;
import org.eclipse.jface.preference.IPreferenceStore;

public class SatterSeriesPreferenceInitializer extends AbstractPreferenceInitializer {

	public void initializeDefaultPreferences() {

		IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
		/*
		 * Line Series
		 */
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_ENABLE_RANGE_SELECTOR, LineSeriesPreferenceConstants.DEF_ENABLE_RANGE_SELECTOR);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_COLOR_HINT_RANGE_SELECTOR, LineSeriesPreferenceConstants.DEF_COLOR_HINT_RANGE_SELECTOR);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_RANGE_SELECTOR_DEFAULT_AXIS_X, LineSeriesPreferenceConstants.DEF_RANGE_SELECTOR_DEFAULT_AXIS_X);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_RANGE_SELECTOR_DEFAULT_AXIS_Y, LineSeriesPreferenceConstants.DEF_RANGE_SELECTOR_DEFAULT_AXIS_Y);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_VERTICAL_SLIDER_VISIBLE, LineSeriesPreferenceConstants.DEF_VERTICAL_SLIDER_VISIBLE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_HORIZONTAL_SLIDER_VISIBLE, LineSeriesPreferenceConstants.DEF_HORIZONTALSLIDER_VISIBLE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_TITLE, LineSeriesPreferenceConstants.DEF_TITLE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_TITLE_VISIBLE, LineSeriesPreferenceConstants.DEF_TITLE_VISIBLE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_TITLE_COLOR, LineSeriesPreferenceConstants.DEF_TITLE_COLOR);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_LEGEND_POSITION, LineSeriesPreferenceConstants.DEF_LEGEND_POSITION);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_LEGEND_VISIBLE, LineSeriesPreferenceConstants.DEF_LEGEND_VISIBLE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_ORIENTATION, LineSeriesPreferenceConstants.DEF_ORIENTATION);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_BACKGROUND, LineSeriesPreferenceConstants.DEF_BACKGROUND);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_BACKGROUND_CHART, LineSeriesPreferenceConstants.DEF_BACKGROUND_CHART);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_BACKGROUND_PLOT_AREA, LineSeriesPreferenceConstants.DEF_BACKGROUND_PLOT_AREA);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_ENABLE_COMPRESS, LineSeriesPreferenceConstants.DEF_ENABLE_COMPRESS);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_ZERO_X, LineSeriesPreferenceConstants.DEF_ZERO_X);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_ZERO_Y, LineSeriesPreferenceConstants.DEF_ZERO_Y);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_RESTRICT_ZOOM, LineSeriesPreferenceConstants.DEF_RESTRICT_ZOOM);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_X_ZOOM_ONLY, LineSeriesPreferenceConstants.DEF_X_ZOOM_ONLY);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_Y_ZOOM_ONLY, LineSeriesPreferenceConstants.DEF_Y_ZOOM_ONLY);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_FORCE_ZERO_MIN_Y, LineSeriesPreferenceConstants.DEF_FORCE_ZERO_MIN_Y);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_FACTOR_EXTEND_MIN_X, LineSeriesPreferenceConstants.DEF_FACTOR_EXTEND_MIN_X);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_FACTOR_EXTEND_MAX_X, LineSeriesPreferenceConstants.DEF_FACTOR_EXTEND_MAX_X);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_FACTOR_EXTEND_MIN_Y, LineSeriesPreferenceConstants.DEF_FACTOR_EXTEND_MIN_Y);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_FACTOR_EXTEND_MAX_Y, LineSeriesPreferenceConstants.DEF_FACTOR_EXTEND_MAX_Y);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SHOW_POSITION_MARKER, LineSeriesPreferenceConstants.DEF_SHOW_POSITION_MARKER);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_COLOR_POSITION_MARKER, LineSeriesPreferenceConstants.DEF_COLOR_POSITION_MARKER);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SHOW_CENTER_MARKER, LineSeriesPreferenceConstants.DEF_SHOW_CENTER_MARKER);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_COLOR_CENTER_MARKER, LineSeriesPreferenceConstants.DEF_COLOR_CENTER_MARKER);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SHOW_POSITION_LEGEND, LineSeriesPreferenceConstants.DEF_SHOW_POSITION_LEGEND);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_COLOR_POSITION_LEGEND, LineSeriesPreferenceConstants.DEF_COLOR_POSITION_LEGEND);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_CREATE_MENU, LineSeriesPreferenceConstants.DEF_CREATE_MENU);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_PRIMARY_X_AXIS_TITLE, LineSeriesPreferenceConstants.DEF_PRIMARY_X_AXIS_TITLE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_PRIMARY_X_AXIS_DESCRIPTION, LineSeriesPreferenceConstants.DEF_PRIMARY_X_AXIS_DESCRIPTION);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_PRIMARY_X_AXIS_DECIMAL_FORMAT_PATTERN, LineSeriesPreferenceConstants.DEF_PRIMARY_X_AXIS_DECIMAL_FORMAT_PATTERN);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_PRIMARY_X_AXIS_DECIMAL_FORMAT_LOCALE, LineSeriesPreferenceConstants.DEF_PRIMARY_X_AXIS_DECIMAL_FORMAT_LOCALE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_PRIMARY_X_AXIS_COLOR, LineSeriesPreferenceConstants.DEF_PRIMARY_X_AXIS_COLOR);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_PRIMARY_X_AXIS_POSITION, LineSeriesPreferenceConstants.DEF_PRIMARY_X_AXIS_POSITION);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_PRIMARY_X_AXIS_VISIBLE, LineSeriesPreferenceConstants.DEF_PRIMARY_X_AXIS_VISIBLE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_PRIMARY_X_AXIS_GRID_LINE_STYLE, LineSeriesPreferenceConstants.DEF_PRIMARY_X_AXIS_GRID_LINE_STYLE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_PRIMARY_X_AXIS_ENABLE_LOG_SCALE, LineSeriesPreferenceConstants.DEF_PRIMARY_X_AXIS_ENABLE_LOG_SCALE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_PRIMARY_Y_AXIS_TITLE, LineSeriesPreferenceConstants.DEF_PRIMARY_Y_AXIS_TITLE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_PRIMARY_Y_AXIS_DESCRIPTION, LineSeriesPreferenceConstants.DEF_PRIMARY_Y_AXIS_DESCRIPTION);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_PRIMARY_Y_AXIS_DECIMAL_FORMAT_PATTERN, LineSeriesPreferenceConstants.DEF_PRIMARY_Y_AXIS_DECIMAL_FORMAT_PATTERN);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_PRIMARY_Y_AXIS_DECIMAL_FORMAT_LOCALE, LineSeriesPreferenceConstants.DEF_PRIMARY_Y_AXIS_DECIMAL_FORMAT_LOCALE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_PRIMARY_Y_AXIS_COLOR, LineSeriesPreferenceConstants.DEF_PRIMARY_Y_AXIS_COLOR);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_PRIMARY_Y_AXIS_POSITION, LineSeriesPreferenceConstants.DEF_PRIMARY_Y_AXIS_POSITION);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_PRIMARY_Y_AXIS_VISIBLE, LineSeriesPreferenceConstants.DEF_PRIMARY_Y_AXIS_VISIBLE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_PRIMARY_Y_AXIS_GRID_LINE_STYLE, LineSeriesPreferenceConstants.DEF_PRIMARY_Y_AXIS_GRID_LINE_STYLE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_PRIMARY_Y_AXIS_ENABLE_LOG_SCALE, LineSeriesPreferenceConstants.DEF_PRIMARY_Y_AXIS_ENABLE_LOG_SCALE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SECONDARY_X_AXIS_TITLE, LineSeriesPreferenceConstants.DEF_SECONDARY_X_AXIS_TITLE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SECONDARY_X_AXIS_DESCRIPTION, LineSeriesPreferenceConstants.DEF_SECONDARY_X_AXIS_DESCRIPTION);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SECONDARY_X_AXIS_DECIMAL_FORMAT_PATTERN, LineSeriesPreferenceConstants.DEF_SECONDARY_X_AXIS_DECIMAL_FORMAT_PATTERN);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SECONDARY_X_AXIS_DECIMAL_FORMAT_LOCALE, LineSeriesPreferenceConstants.DEF_SECONDARY_X_AXIS_DECIMAL_FORMAT_LOCALE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SECONDARY_X_AXIS_COLOR, LineSeriesPreferenceConstants.DEF_SECONDARY_X_AXIS_COLOR);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SECONDARY_X_AXIS_POSITION, LineSeriesPreferenceConstants.DEF_SECONDARY_X_AXIS_POSITION);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SECONDARY_X_AXIS_VISIBLE, LineSeriesPreferenceConstants.DEF_SECONDARY_X_AXIS_VISIBLE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SECONDARY_X_AXIS_GRID_LINE_STYLE, LineSeriesPreferenceConstants.DEF_SECONDARY_X_AXIS_GRID_LINE_STYLE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SECONDARY_X_AXIS_ENABLE_LOG_SCALE, LineSeriesPreferenceConstants.DEF_SECONDARY_X_AXIS_ENABLE_LOG_SCALE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SECONDARY_Y_AXIS_TITLE, LineSeriesPreferenceConstants.DEF_SECONDARY_Y_AXIS_TITLE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SECONDARY_Y_AXIS_DESCRIPTION, LineSeriesPreferenceConstants.DEF_SECONDARY_Y_AXIS_DESCRIPTION);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SECONDARY_Y_AXIS_DECIMAL_FORMAT_PATTERN, LineSeriesPreferenceConstants.DEF_SECONDARY_Y_AXIS_DECIMAL_FORMAT_PATTERN);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SECONDARY_Y_AXIS_DECIMAL_FORMAT_LOCALE, LineSeriesPreferenceConstants.DEF_SECONDARY_Y_AXIS_DECIMAL_FORMAT_LOCALE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SECONDARY_Y_AXIS_COLOR, LineSeriesPreferenceConstants.DEF_SECONDARY_Y_AXIS_COLOR);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SECONDARY_Y_AXIS_POSITION, LineSeriesPreferenceConstants.DEF_SECONDARY_Y_AXIS_POSITION);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SECONDARY_Y_AXIS_VISIBLE, LineSeriesPreferenceConstants.DEF_SECONDARY_Y_AXIS_VISIBLE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SECONDARY_Y_AXIS_GRID_LINE_STYLE, LineSeriesPreferenceConstants.DEF_SECONDARY_Y_AXIS_GRID_LINE_STYLE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SECONDARY_Y_AXIS_ENABLE_LOG_SCALE, LineSeriesPreferenceConstants.DEF_SECONDARY_Y_AXIS_ENABLE_LOG_SCALE);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_ANTIALIAS_SERIES_1, LineSeriesPreferenceConstants.DEF_ANTIALIAS_SERIES_1);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_DESCRIPTION_SERIES_1, LineSeriesPreferenceConstants.DEF_DESCRIPTION_SERIES_1);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_ENABLE_AREA_SERIES_1, LineSeriesPreferenceConstants.DEF_ENABLE_AREA_SERIES_1);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_ENABLE_STACK_SERIES_1, LineSeriesPreferenceConstants.DEF_ENABLE_STACK_SERIES_1);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_ENABLE_STEP_SERIES_1, LineSeriesPreferenceConstants.DEF_ENABLE_STEP_SERIES_1);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_LINE_COLOR_SERIES_1, LineSeriesPreferenceConstants.DEF_LINE_COLOR_SERIES_1);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_LINE_COLOR_SERIES_1, LineSeriesPreferenceConstants.DEF_LINE_COLOR_SERIES_1);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_LINE_STYLE_SERIES_1, LineSeriesPreferenceConstants.DEF_LINE_STYLE_SERIES_1);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_LINE_WIDTH_SERIES_1, LineSeriesPreferenceConstants.DEF_LINE_WIDTH_SERIES_1);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SYMBOL_COLOR_SERIES_1, LineSeriesPreferenceConstants.DEF_SYMBOL_COLOR_SERIES_1);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SYMBOL_SIZE_SERIES_1, LineSeriesPreferenceConstants.DEF_SYMBOL_SIZE_SERIES_1);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SYMBOL_TYPE_SERIES_1, LineSeriesPreferenceConstants.DEF_SYMBOL_TYPE_SERIES_1);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_VISIBLE_SERIES_1, LineSeriesPreferenceConstants.DEF_VISIBLE_SERIES_1);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_VISIBLE_IN_LEGEND_SERIES_1, LineSeriesPreferenceConstants.DEF_VISIBLE_IN_LEGEND_SERIES_1);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_ANTIALIAS_SERIES_2, LineSeriesPreferenceConstants.DEF_ANTIALIAS_SERIES_2);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_DESCRIPTION_SERIES_2, LineSeriesPreferenceConstants.DEF_DESCRIPTION_SERIES_2);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_ENABLE_AREA_SERIES_2, LineSeriesPreferenceConstants.DEF_ENABLE_AREA_SERIES_2);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_ENABLE_STACK_SERIES_2, LineSeriesPreferenceConstants.DEF_ENABLE_STACK_SERIES_2);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_ENABLE_STEP_SERIES_2, LineSeriesPreferenceConstants.DEF_ENABLE_STEP_SERIES_2);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_LINE_COLOR_SERIES_2, LineSeriesPreferenceConstants.DEF_LINE_COLOR_SERIES_2);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_LINE_COLOR_SERIES_2, LineSeriesPreferenceConstants.DEF_LINE_COLOR_SERIES_2);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_LINE_STYLE_SERIES_2, LineSeriesPreferenceConstants.DEF_LINE_STYLE_SERIES_2);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_LINE_WIDTH_SERIES_2, LineSeriesPreferenceConstants.DEF_LINE_WIDTH_SERIES_2);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SYMBOL_COLOR_SERIES_2, LineSeriesPreferenceConstants.DEF_SYMBOL_COLOR_SERIES_2);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SYMBOL_SIZE_SERIES_2, LineSeriesPreferenceConstants.DEF_SYMBOL_SIZE_SERIES_2);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_SYMBOL_TYPE_SERIES_2, LineSeriesPreferenceConstants.DEF_SYMBOL_TYPE_SERIES_2);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_VISIBLE_SERIES_2, LineSeriesPreferenceConstants.DEF_VISIBLE_SERIES_2);
		preferenceStore.setDefault(LineSeriesPreferenceConstants.P_VISIBLE_IN_LEGEND_SERIES_2, LineSeriesPreferenceConstants.DEF_VISIBLE_IN_LEGEND_SERIES_2);
	}
}
