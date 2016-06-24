/**
 */
package geometry.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import geometry.GeometryFactory;
import geometry.GeometryPackage;
import geometry.INode;
import geometry.Operator;
import geometry.Shape;
import geometry.Triangle;
import geometry.Vertex;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Operator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link geometry.impl.OperatorImpl#getName <em>Name</em>}</li>
 *   <li>{@link geometry.impl.OperatorImpl#getId <em>Id</em>}</li>
 *   <li>{@link geometry.impl.OperatorImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link geometry.impl.OperatorImpl#getType <em>Type</em>}</li>
 *   <li>{@link geometry.impl.OperatorImpl#getTriangles <em>Triangles</em>}</li>
 *   <li>{@link geometry.impl.OperatorImpl#getCenter <em>Center</em>}</li>
 *   <li>{@link geometry.impl.OperatorImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatorImpl extends MinimalEObjectImpl.Container
		implements Operator {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<INode> nodes;
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getTriangles() <em>Triangles</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTriangles()
	 * @generated
	 * @ordered
	 */
	protected EList<Triangle> triangles;
	/**
	 * The cached value of the '{@link #getCenter() <em>Center</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCenter()
	 * @generated
	 * @ordered
	 */
	protected Vertex center;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected INode parent;
	/**
	 * A map of the operator's properties, mapping from the property name to its
	 * value.
	 */
	protected Map<String, Double> properties;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeometryPackage.Literals.OPERATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.OPERATOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.OPERATOR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<INode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<INode>(INode.class, this, GeometryPackage.OPERATOR__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.OPERATOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Triangle> getTriangles() {
		if (triangles == null) {
			triangles = new EObjectContainmentEList<Triangle>(Triangle.class, this, GeometryPackage.OPERATOR__TRIANGLES);
		}
		return triangles;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vertex getCenter() {
		if (center != null && center.eIsProxy()) {
			InternalEObject oldCenter = (InternalEObject)center;
			center = (Vertex)eResolveProxy(oldCenter);
			if (center != oldCenter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeometryPackage.OPERATOR__CENTER, oldCenter, center));
			}
		}
		return center;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetCenter() {
		return center;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCenter(Vertex newCenter) {
		Vertex oldCenter = center;
		center = newCenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.OPERATOR__CENTER, oldCenter, center));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public INode getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (INode)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeometryPackage.OPERATOR__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public INode basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(INode newParent) {
		INode oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.OPERATOR__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void changeDecoratorProperty(String property, Object value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPropertyNames() {
		//Return a list of the properties' keys.
		return new BasicEList<String>(properties.keySet());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getProperty(final String property) {
		return properties.get(property);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProperty(final String property, final double value) {
		properties.put(property, value);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void addNode(INode child) {

		// Set self as the child's parent
		child.setParent(this);

		// Add the child to the list
		nodes.add(child);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void removeNode(INode child) {

		// If the node is not already a child of this, fail silently
		if (nodes.contains(child)) {

			// Remove self as child's parent.
			child.setParent(null);

			// Remove the child from the list
			nodes.remove(child);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void copy(Object source) {

		// If the source is not a Shape, fail silently
		if (source instanceof Operator) {

			// Cast the source into a shape
			Shape castSource = (Shape) source;

			// Copy the data members
			name = castSource.getName();
			id = castSource.getId();
			type = castSource.getType();

			// Create a new center
			center = GeometryFactory.eINSTANCE.createVertex();

			// Make the center a copy of the source's
			Vertex sourceCenter = castSource.getCenter();
			center.setX(sourceCenter.getX());
			center.setY(sourceCenter.getY());
			center.setZ(sourceCenter.getZ());

			// Empty the triangles array
			triangles.clear();

			// Copy each triangle in the source
			for (Triangle triangle : castSource.getTriangles()) {

				// The new triangle being created
				Triangle clone = GeometryFactory.eINSTANCE.createTriangle();

				// Copy each vertex in the triangle
				for (Vertex vertex : triangle.getVertices()) {

					// The new vertex being created
					Vertex cloneVertex = GeometryFactory.eINSTANCE
							.createVertex();

					// Copy the coordinates
					cloneVertex.setX(vertex.getX());
					cloneVertex.setY(vertex.getY());
					cloneVertex.setZ(vertex.getZ());

					// Add the vertex to the triangle
					clone.getVertices().add(cloneVertex);
				}

				// Set the normal to a copy of the triangle's
				Vertex normal = triangle.getNormal();
				Vertex cloneNormal = GeometryFactory.eINSTANCE.createVertex();
				cloneNormal.setX(normal.getX());
				cloneNormal.setY(normal.getY());
				cloneNormal.setZ(normal.getZ());
				clone.setNormal(cloneNormal);

				// Add the cloned triangle to the list
				triangles.add(clone);
			}

			// Remove all nodes
			for (INode node : nodes) {
				removeNode(node);
			}

			// Add a copy of each of the source's children
			for (INode node : castSource.getNodes()) {
				addNode((INode) node.clone());
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object clone() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeometryPackage.OPERATOR__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case GeometryPackage.OPERATOR__TRIANGLES:
				return ((InternalEList<?>)getTriangles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeometryPackage.OPERATOR__NAME:
				return getName();
			case GeometryPackage.OPERATOR__ID:
				return getId();
			case GeometryPackage.OPERATOR__NODES:
				return getNodes();
			case GeometryPackage.OPERATOR__TYPE:
				return getType();
			case GeometryPackage.OPERATOR__TRIANGLES:
				return getTriangles();
			case GeometryPackage.OPERATOR__CENTER:
				if (resolve) return getCenter();
				return basicGetCenter();
			case GeometryPackage.OPERATOR__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeometryPackage.OPERATOR__NAME:
				setName((String)newValue);
				return;
			case GeometryPackage.OPERATOR__ID:
				setId((Long)newValue);
				return;
			case GeometryPackage.OPERATOR__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends INode>)newValue);
				return;
			case GeometryPackage.OPERATOR__TYPE:
				setType((String)newValue);
				return;
			case GeometryPackage.OPERATOR__TRIANGLES:
				getTriangles().clear();
				getTriangles().addAll((Collection<? extends Triangle>)newValue);
				return;
			case GeometryPackage.OPERATOR__CENTER:
				setCenter((Vertex)newValue);
				return;
			case GeometryPackage.OPERATOR__PARENT:
				setParent((INode)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GeometryPackage.OPERATOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GeometryPackage.OPERATOR__ID:
				setId(ID_EDEFAULT);
				return;
			case GeometryPackage.OPERATOR__NODES:
				getNodes().clear();
				return;
			case GeometryPackage.OPERATOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GeometryPackage.OPERATOR__TRIANGLES:
				getTriangles().clear();
				return;
			case GeometryPackage.OPERATOR__CENTER:
				setCenter((Vertex)null);
				return;
			case GeometryPackage.OPERATOR__PARENT:
				setParent((INode)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GeometryPackage.OPERATOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GeometryPackage.OPERATOR__ID:
				return id != ID_EDEFAULT;
			case GeometryPackage.OPERATOR__NODES:
				return nodes != null && !nodes.isEmpty();
			case GeometryPackage.OPERATOR__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case GeometryPackage.OPERATOR__TRIANGLES:
				return triangles != null && !triangles.isEmpty();
			case GeometryPackage.OPERATOR__CENTER:
				return center != null;
			case GeometryPackage.OPERATOR__PARENT:
				return parent != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case GeometryPackage.OPERATOR___CHANGE_DECORATOR_PROPERTY__STRING_OBJECT:
				changeDecoratorProperty((String)arguments.get(0), arguments.get(1));
				return null;
			case GeometryPackage.OPERATOR___GET_PROPERTY_NAMES:
				return getPropertyNames();
			case GeometryPackage.OPERATOR___GET_PROPERTY__STRING:
				return getProperty((String)arguments.get(0));
			case GeometryPackage.OPERATOR___SET_PROPERTY__STRING_DOUBLE:
				setProperty((String)arguments.get(0), (Double)arguments.get(1));
				return null;
			case GeometryPackage.OPERATOR___ADD_NODE__INODE:
				addNode((INode)arguments.get(0));
				return null;
			case GeometryPackage.OPERATOR___REMOVE_NODE__INODE:
				removeNode((INode)arguments.get(0));
				return null;
			case GeometryPackage.OPERATOR___COPY__OBJECT:
				copy(arguments.get(0));
				return null;
			case GeometryPackage.OPERATOR___CLONE:
				return clone();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // OperatorImpl
