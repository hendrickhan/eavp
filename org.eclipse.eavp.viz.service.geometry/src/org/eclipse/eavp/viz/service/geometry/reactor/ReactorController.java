/*******************************************************************************
 * Copyright (c) 2015 UT-Battelle, LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Robert Smith
 *******************************************************************************/
package org.eclipse.eavp.viz.service.geometry.reactor;

import org.eclipse.eavp.viz.modeling.base.BasicController;
import org.eclipse.eavp.viz.modeling.base.BasicView;
import org.eclipse.eavp.viz.modeling.base.ITransparentController;
import org.eclipse.eavp.viz.modeling.base.ITransparentView;
import org.eclipse.eavp.viz.modeling.base.IWireframeController;
import org.eclipse.eavp.viz.modeling.base.IWireframeView;

/**
 * A reactor part for a Reactor Analyzer. Reactors represent a container around
 * core channels. Reactors are represented by a cut away view of a capsule
 * shaped container which is drawn around all the part's core channel children.
 * 
 * @author Robert Smith
 *
 */
public class ReactorController extends BasicController
		implements ITransparentController, IWireframeController {

	/**
	 * The nullary constructor.
	 */
	public ReactorController() {
		super();
	}

	/**
	 * The default constructor
	 * 
	 * @param model
	 *            The internal representation of the reactor
	 * @param view
	 *            The graphical representation of the reactor
	 */
	public ReactorController(Reactor model, BasicView view) {
		super(model, view);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.eavp.viz.service.reactor.javafx.datatypes.WireFramePart#
	 * setWireFrameMode(boolean)
	 */
	@Override
	public void setWireframeMode(boolean on) {
		((IWireframeView) view).setWireframeMode(on);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.eavp.viz.modeling.base.IWireframeController#isWireframe()
	 */
	@Override
	public boolean isWireframe() {
		return ((IWireframeView) view).isWireframe();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.eavp.viz.modeling.base.ITransparentController#isTransparent()
	 */
	@Override
	public boolean isTransparent() {
		return ((ITransparentView) view).isTransparent();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.eavp.viz.modeling.base.ITransparentController#setTransparentMode(boolean)
	 */
	@Override
	public void setTransparentMode(boolean transparent) {
		((ITransparentView) view).setTransparentMode(transparent);
	}
}
