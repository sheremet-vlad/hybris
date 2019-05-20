/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 20.05.2019 9:30:27                          ---
 * ----------------------------------------------------------------
 */
package expandcustomer.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import expandcustomer.model.SportModel;
import java.util.Locale;

/**
 * Generated model class for type SportProduct first defined at extension expandcustomer.
 */
@SuppressWarnings("all")
public class SportProductModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SportProduct";
	
	/** <i>Generated constant</i> - Attribute key of <code>SportProduct.name</code> attribute defined at extension <code>expandcustomer</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>SportProduct.description</code> attribute defined at extension <code>expandcustomer</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>SportProduct.sport</code> attribute defined at extension <code>expandcustomer</code>. */
	public static final String SPORT = "sport";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SportProductModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SportProductModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _sport initial attribute declared by type <code>SportProduct</code> at extension <code>expandcustomer</code>
	 */
	@Deprecated
	public SportProductModel(final SportModel _sport)
	{
		super();
		setSport(_sport);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _sport initial attribute declared by type <code>SportProduct</code> at extension <code>expandcustomer</code>
	 */
	@Deprecated
	public SportProductModel(final ItemModel _owner, final SportModel _sport)
	{
		super();
		setOwner(_owner);
		setSport(_sport);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SportProduct.description</code> attribute defined at extension <code>expandcustomer</code>. 
	 * @return the description
	 */
	@Accessor(qualifier = "description", type = Accessor.Type.GETTER)
	public String getDescription()
	{
		return getDescription(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>SportProduct.description</code> attribute defined at extension <code>expandcustomer</code>. 
	 * @param loc the value localization key 
	 * @return the description
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "description", type = Accessor.Type.GETTER)
	public String getDescription(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(DESCRIPTION, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SportProduct.name</code> attribute defined at extension <code>expandcustomer</code>. 
	 * @return the name
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.GETTER)
	public String getName()
	{
		return getName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>SportProduct.name</code> attribute defined at extension <code>expandcustomer</code>. 
	 * @param loc the value localization key 
	 * @return the name
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.GETTER)
	public String getName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(NAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SportProduct.sport</code> attribute defined at extension <code>expandcustomer</code>. 
	 * @return the sport
	 */
	@Accessor(qualifier = "sport", type = Accessor.Type.GETTER)
	public SportModel getSport()
	{
		return getPersistenceContext().getPropertyValue(SPORT);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SportProduct.description</code> attribute defined at extension <code>expandcustomer</code>. 
	 *  
	 * @param value the description
	 */
	@Accessor(qualifier = "description", type = Accessor.Type.SETTER)
	public void setDescription(final String value)
	{
		setDescription(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>SportProduct.description</code> attribute defined at extension <code>expandcustomer</code>. 
	 *  
	 * @param value the description
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "description", type = Accessor.Type.SETTER)
	public void setDescription(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(DESCRIPTION, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SportProduct.name</code> attribute defined at extension <code>expandcustomer</code>. 
	 *  
	 * @param value the name
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.SETTER)
	public void setName(final String value)
	{
		setName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>SportProduct.name</code> attribute defined at extension <code>expandcustomer</code>. 
	 *  
	 * @param value the name
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.SETTER)
	public void setName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(NAME, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SportProduct.sport</code> attribute defined at extension <code>expandcustomer</code>. 
	 *  
	 * @param value the sport
	 */
	@Accessor(qualifier = "sport", type = Accessor.Type.SETTER)
	public void setSport(final SportModel value)
	{
		getPersistenceContext().setPropertyValue(SPORT, value);
	}
	
}
