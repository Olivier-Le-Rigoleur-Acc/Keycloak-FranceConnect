package fr.insee.keycloak;

import org.keycloak.broker.oidc.mappers.AbstractJsonUserAttributeMapper;

public class FranceConnectUserAttributeMapper extends AbstractJsonUserAttributeMapper {
  private static final String[] cp =
      new String[] {
          FranceConnectParticulierProdIdentityProviderFactory.PROVIDER_ID,
          FranceConnectParticulierTestIdentityProviderFactory.PROVIDER_ID};

  @Override
  public String[] getCompatibleProviders() {
    return cp;
  }

  @Override
  public String getId() {
    return "franceconnect-user-attribute-mapper";
  }

}
