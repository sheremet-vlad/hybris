/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 20.05.2019 9:30:27                          ---
 * ----------------------------------------------------------------
 */
package expandcustomer.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import expandcustomer.constants.ExpandcustomerConstants;
import expandcustomer.jalo.Sport;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type SportProduct.
 */
@SLDSafe
@SuppressWarnings({"unused","cast","PMD"})
public class SportProduct extends GenericItem
{
	/** Qualifier of the <code>SportProduct.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>SportProduct.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>SportProduct.sport</code> attribute **/
	public static final String SPORT = "sport";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SPORT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<SportProduct> SPORTHANDLER = new BidirectionalOneToManyHandler<SportProduct>(
	ExpandcustomerConstants.TC.SPORTPRODUCT,
	false,
	"sport",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(SPORT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SPORTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SportProduct.description</code> attribute.
	 * @return the description
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("SportProduct.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, "description".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SportProduct.description</code> attribute.
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SportProduct.description</code> attribute. 
	 * @return the localized description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,"description".intern(),C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SportProduct.description</code> attribute. 
	 * @return the localized description
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SportProduct.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("SportProduct.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, "description".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SportProduct.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SportProduct.description</code> attribute. 
	 * @param value the description
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,"description".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SportProduct.description</code> attribute. 
	 * @param value the description
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SportProduct.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("SportProduct.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, "name".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SportProduct.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SportProduct.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,"name".intern(),C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SportProduct.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SportProduct.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("SportProduct.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, "name".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SportProduct.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SportProduct.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,"name".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SportProduct.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SportProduct.sport</code> attribute.
	 * @return the sport
	 */
	public Sport getSport(final SessionContext ctx)
	{
		return (Sport)getProperty( ctx, "sport".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SportProduct.sport</code> attribute.
	 * @return the sport
	 */
	public Sport getSport()
	{
		return getSport( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SportProduct.sport</code> attribute. 
	 * @param value the sport
	 */
	public void setSport(final SessionContext ctx, final Sport value)
	{
		SPORTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SportProduct.sport</code> attribute. 
	 * @param value the sport
	 */
	public void setSport(final Sport value)
	{
		setSport( getSession().getSessionContext(), value );
	}
	
}
