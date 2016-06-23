/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import geometry.INode;
import model.IRenderElement;
import model.MeshCache;
import model.ModelPackage;
import model.RenderObject;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Render Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link model.impl.RenderObjectImpl#getMeshCache <em>Mesh Cache</em>}</li>
 * <li>{@link model.impl.RenderObjectImpl#getRender <em>Render</em>}</li>
 * <li>{@link model.impl.RenderObjectImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RenderObjectImpl<T> extends MinimalEObjectImpl.Container
		implements RenderObject<T> {
	/**
	 * The cached value of the '{@link #getMeshCache() <em>Mesh Cache</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMeshCache()
	 * @generated
	 * @ordered
	 */
	protected MeshCache<?> meshCache;

	/**
	 * The cached value of the '{@link #getRender() <em>Render</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRender()
	 * @generated
	 * @ordered
	 */
	protected T render;

	/**
	 * The map of rendering properties. Property names are the keys.
	 * 
	 * @generated NOT
	 */
	protected Map<String, Object> properties;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final INode SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected INode source = SOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RenderObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RENDER_OBJECT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public MeshCache<?> getMeshCache() {
		if (meshCache != null && meshCache.eIsProxy()) {
			InternalEObject oldMeshCache = (InternalEObject) meshCache;
			meshCache = (MeshCache<?>) eResolveProxy(oldMeshCache);
			if (meshCache != oldMeshCache) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelPackage.RENDER_OBJECT__MESH_CACHE,
							oldMeshCache, meshCache));
			}
		}
		return meshCache;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MeshCache<?> basicGetMeshCache() {
		return meshCache;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setMeshCache(MeshCache<?> newMeshCache) {
		MeshCache<?> oldMeshCache = meshCache;
		meshCache = newMeshCache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.RENDER_OBJECT__MESH_CACHE, oldMeshCache,
					meshCache));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public T getRender() {
		return render;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRender(T newRender) {
		T oldRender = render;
		render = newRender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.RENDER_OBJECT__RENDER, oldRender, render));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public INode getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSource(INode newSource) {
		INode oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.RENDER_OBJECT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public T getMesh() {
		return render;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public INode getBase() {

		// A render object is at the bottom of the decorator hierarchy always
		// has the base data object as its source.
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void handleChildren(EList<IRenderElement<T>> children) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getProperty(String property) {
		return properties.get(property);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setProperty(String property, Object value) {
		properties.put(property, value);

		// Send a notification of the object's new value with the property name
		// as the old value. Listeners must be able to handle this specially
		// formatted input.
		eNotify(new ENotificationImpl(this, Notification.SET,
				ModelPackage.RENDER_OBJECT___SET_PROPERTY__STRING_OBJECT,
				property, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.RENDER_OBJECT__MESH_CACHE:
			if (resolve)
				return getMeshCache();
			return basicGetMeshCache();
		case ModelPackage.RENDER_OBJECT__RENDER:
			return getRender();
		case ModelPackage.RENDER_OBJECT__SOURCE:
			return getSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.RENDER_OBJECT__MESH_CACHE:
			setMeshCache((MeshCache<?>) newValue);
			return;
		case ModelPackage.RENDER_OBJECT__RENDER:
			setRender((T) newValue);
			return;
		case ModelPackage.RENDER_OBJECT__SOURCE:
			setSource((INode) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModelPackage.RENDER_OBJECT__MESH_CACHE:
			setMeshCache((MeshCache<?>) null);
			return;
		case ModelPackage.RENDER_OBJECT__RENDER:
			setRender((T) null);
			return;
		case ModelPackage.RENDER_OBJECT__SOURCE:
			setSource(SOURCE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModelPackage.RENDER_OBJECT__MESH_CACHE:
			return meshCache != null;
		case ModelPackage.RENDER_OBJECT__RENDER:
			return render != null;
		case ModelPackage.RENDER_OBJECT__SOURCE:
			return SOURCE_EDEFAULT == null ? source != null
					: !SOURCE_EDEFAULT.equals(source);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case ModelPackage.RENDER_OBJECT___GET_MESH:
			return getMesh();
		case ModelPackage.RENDER_OBJECT___GET_BASE:
			return getBase();
		case ModelPackage.RENDER_OBJECT___HANDLE_CHILDREN__ELIST:
			handleChildren((EList<IRenderElement<T>>) arguments.get(0));
			return null;
		case ModelPackage.RENDER_OBJECT___GET_PROPERTY:
			return getProperty((String) arguments.get(0));
		case ModelPackage.RENDER_OBJECT___SET_PROPERTY__STRING_OBJECT:
			setProperty((String) arguments.get(0), arguments.get(1));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (render: ");
		result.append(render);
		result.append(", source: ");
		result.append(source);
		result.append(')');
		return result.toString();
	}
} // RenderObjectImpl
