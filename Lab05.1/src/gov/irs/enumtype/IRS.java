package gov.irs.enumtype;

import gov.irs.TaxPayer;

public interface IRS {

  static IRS getInstance() { //default to public
    return IRSEnum.INSTANCE;
  }

  void collectTaxes(); //defaults to abstract

  void register(TaxPayer payer);


}
