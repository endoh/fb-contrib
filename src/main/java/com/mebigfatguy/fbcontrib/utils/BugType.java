/*
 * fb-contrib - Auxiliary detectors for Java programs
 * Copyright (C) 2005-2019 Dave Brosius
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package com.mebigfatguy.fbcontrib.utils;

/**
 * an enumeration of all the bug instance types that fb-contrib produces
 */
public enum BugType {
    // @formatter:off
    ABC_ARRAY_BASED_COLLECTIONS,
    ACEM_ABSTRACT_CLASS_EMPTY_METHODS,
    AFBR_ABNORMAL_FINALLY_BLOCK_RETURN,
    AIOB_ARRAY_INDEX_OUT_OF_BOUNDS,
    AIOB_ARRAY_STORE_TO_NULL_REFERENCE,
    AI_ANNOTATION_ISSUES_NEEDS_NULLABLE,
    AOM_ABSTRACT_OVERRIDDEN_METHOD,
    AWCBR_ARRAY_WRAPPED_CALL_BY_REFERENCE,

    BAS_BLOATED_ASSIGNMENT_SCOPE,
    BED_BOGUS_EXCEPTION_DECLARATION,
    BED_HIERARCHICAL_EXCEPTION_DECLARATION,
    BL_BURYING_LOGIC,
    BRPI_BACKPORT_REUSE_PUBLIC_IDENTIFIERS,
    BSB_BLOATED_SYNCHRONIZED_BLOCK,

    CAAL_CONFUSING_ARRAY_AS_LIST,
    CAO_CONFUSING_AUTOBOXED_OVERLOADING,
    CBC_CONTAINS_BASED_CONDITIONAL,
    CBX_CUSTOM_BUILT_XML,
    CC_CYCLOMATIC_COMPLEXITY,
    CCI_CONCURRENT_COLLECTION_ISSUES_USE_PUT_IS_RACY,
    CCNE_COMPARE_CLASS_EQUALS_NAME,
    CEBE_COMMONS_EQUALS_BUILDER_ISEQUALS,
    CE_CLASS_ENVY,
    CFS_CONFUSING_FUNCTION_SEMANTICS,
    CHTH_COMMONS_HASHCODE_BUILDER_TOHASHCODE,
    CLI_CONSTANT_LIST_INDEX,
    CNC_COLLECTION_NAMING_CONFUSION,
    COM_COPIED_OVERRIDDEN_METHOD,
    COM_PARENT_DELEGATED_CALL,
    CRF_CONFLATING_RESOURCES_AND_FILES,
    CSBTS_COMMONS_STRING_BUILDER_TOSTRING,
    CSI_CHAR_SET_ISSUES_UNKNOWN_ENCODING,
    CSI_CHAR_SET_ISSUES_USE_STANDARD_CHARSET,
    CSI_CHAR_SET_ISSUES_USE_STANDARD_CHARSET_NAME,
    CTU_CONFLICTING_TIME_UNITS,
    CU_CLONE_USABILITY_MISMATCHED_RETURN,
    CU_CLONE_USABILITY_OBJECT_RETURN,
    CU_CLONE_USABILITY_THROWS,
    CVAA_CONTRAVARIANT_ARRAY_ASSIGNMENT,
    CVAA_CONTRAVARIANT_ELEMENT_ASSIGNMENT,

    DDC_DOUBLE_DATE_COMPARISON,
    DLC_DUBIOUS_LIST_COLLECTION,
    DMC_DUBIOUS_MAP_COLLECTION,
    DRE_DECLARED_RUNTIME_EXCEPTION,
    DSOC_DUBIOUS_SET_OF_COLLECTIONS,
    DTEP_DEPRECATED_TYPESAFE_ENUM_PATTERN,
    DWI_DELETING_WHILE_ITERATING,
    DWI_MODIFYING_WHILE_ITERATING,

    ENMI_ONE_ENUM_VALUE,
    EXS_EXCEPTION_SOFTENING_HAS_CHECKED,
    EXS_EXCEPTION_SOFTENING_NO_CHECKED,
    EXS_EXCEPTION_SOFTENING_NO_CONSTRAINTS,
    EXS_EXCEPTION_SOFTENING_RETURN_FALSE,

    FCBL_FIELD_COULD_BE_LOCAL,
    FCCD_FIND_CLASS_CIRCULAR_DEPENDENCY,
    FII_AVOID_CONTAINS_ON_COLLECTED_STREAM,
    FII_AVOID_SIZE_ON_COLLECTED_STREAM,
    FII_COMBINE_FILTERS,
    FII_USE_ANY_MATCH,
    FII_USE_FIND_FIRST,
    FII_USE_FUNCTION_IDENTITY,
    FII_USE_METHOD_REFERENCE,
    FP_FINAL_PARAMETERS,
    FPL_FLOATING_POINT_LOOPS,

    HCP_HTTP_REQUEST_RESOURCES_NOT_FREED_FIELD,
    HCP_HTTP_REQUEST_RESOURCES_NOT_FREED_LOCAL,
    HES_EXECUTOR_NEVER_SHUTDOWN,
    HES_EXECUTOR_OVERWRITTEN_WITHOUT_SHUTDOWN,
    HES_LOCAL_EXECUTOR_SERVICE,

    ICA_INVALID_CONSTANT_ARGUMENT,
    IICU_INCORRECT_INTERNAL_CLASS_USE,
    IKNC_INCONSISTENT_HTTP_ATTRIBUTE_CASING,
    IKNC_INCONSISTENT_HTTP_PARAM_CASING,
    IMC_IMMATURE_CLASS_IDE_GENERATED_PARAMETER_NAMES,
    IMC_IMMATURE_CLASS_NO_EQUALS,
    IMC_IMMATURE_CLASS_NO_HASHCODE,
    IMC_IMMATURE_CLASS_NO_PACKAGE,
    IMC_IMMATURE_CLASS_NO_TOSTRING,
    IMC_IMMATURE_CLASS_PRINTSTACKTRACE,
    IMC_IMMATURE_CLASS_WRONG_FIELD_ORDER,
    IMC_IMMATURE_CLASS_UPPER_PACKAGE,
    IMC_IMMATURE_CLASS_LOWER_CLASS,
    IMC_IMMATURE_CLASS_BAD_SERIALVERSIONUID,
    IMC_IMMATURE_CLASS_VAR_NAME,
    IOI_COPY_WITH_READER,
    IOI_DOUBLE_BUFFER_COPY,
    IOI_UNENDED_ZLIB_OBJECT,
    IOI_USE_OF_FILE_STREAM_CONSTRUCTORS,
    IPU_IMPROPER_PROPERTIES_USE,
    IPU_IMPROPER_PROPERTIES_USE_SETPROPERTY,
    ISB_EMPTY_STRING_APPENDING,
    ISB_INEFFICIENT_STRING_BUFFERING,
    ISB_TOSTRING_APPENDING,
    ITC_INHERITANCE_TYPE_CHECKING,
    ITU_INAPPROPRIATE_TOSTRING_USE,

    JPAI_HC_EQUALS_ON_MANAGED_ENTITY,
    JPAI_IGNORED_MERGE_RESULT,
    JPAI_INEFFICIENT_EAGER_FETCH,
    JPAI_NON_PROXIED_TRANSACTION_CALL,
    JPAI_NON_SPECIFIED_TRANSACTION_EXCEPTION_HANDLING,
    JPAI_TRANSACTION_ON_NON_PUBLIC_METHOD,
    JPAI_UNNECESSARY_TRANSACTION_EXCEPTION_HANDLING,
    JVR_JDBC_VENDOR_RELIANCE,
    JXI_GET_ENDPOINT_CONSUMES_CONTENT,
    JXI_INVALID_CONTEXT_PARAMETER_TYPE,
    JXI_PARM_PARAM_NOT_FOUND_IN_PATH,
    JXI_UNDEFINED_PARAMETER_SOURCE_IN_ENDPOINT,

    LEST_LOST_EXCEPTION_STACK_TRACE,
    LGO_LINGERING_GRAPHICS_OBJECT,
    LII_LIST_INDEXED_ITERATING,
    LO_APPENDED_STRING_IN_FORMAT_STRING,
    LO_EMBEDDED_SIMPLE_STRING_FORMAT_IN_FORMAT_STRING,
    LO_EXCEPTION_WITH_LOGGER_PARMS,
    LO_INCORRECT_NUMBER_OF_ANCHOR_PARAMETERS,
    LO_INVALID_FORMATTING_ANCHOR,
    LO_INVALID_STRING_FORMAT_NOTATION,
    LO_LOGGER_LOST_EXCEPTION_STACK_TRACE,
    LO_NON_PRIVATE_STATIC_LOGGER,
    LO_STUTTERED_MESSAGE,
    LO_SUSPECT_LOG_CLASS,
    LO_SUSPECT_LOG_PARAMETER,
    LO_TOSTRING_PARAMETER,
    LSC_LITERAL_STRING_COMPARISON,
    LSYC_LOCAL_SYNCHRONIZED_COLLECTION,
    LUI_USE_COLLECTION_ADD,
    LUI_USE_GET0,
    LUI_USE_SINGLETON_LIST,

    MAC_MANUAL_ARRAY_COPY,
    MDM_BIGDECIMAL_EQUALS,
    MDM_INETADDRESS_GETLOCALHOST,
    MDM_LOCK_ISLOCKED,
    MDM_PROMISCUOUS_SERVERSOCKET,
    MDM_RANDOM_SEED,
    MDM_RUNFINALIZATION,
    MDM_RUNTIME_EXIT_OR_HALT,
    MDM_SECURERANDOM,
    MDM_SETDEFAULTLOCALE,
    MDM_SIGNAL_NOT_SIGNALALL,
    MDM_STRING_BYTES_ENCODING,
    MDM_THREAD_FAIRNESS,
    MDM_THREAD_PRIORITIES,
    MDM_THREAD_YIELD,
    MDM_WAIT_WITHOUT_TIMEOUT,
    MOM_MISLEADING_OVERLOAD_MODEL,
    MRC_METHOD_RETURNS_CONSTANT,
    MUC_MODIFYING_UNMODIFIABLE_COLLECTION,
    MUI_CALLING_SIZE_ON_SUBCONTAINER,
    MUI_CONTAINSKEY_BEFORE_GET,
    MUI_GET_BEFORE_REMOVE,
    MUI_NULL_CHECK_ON_MAP_SUBSET_ACCESSOR,
    MUI_USE_CONTAINSKEY,

    NAB_NEEDLESS_AUTOBOXING_CTOR,
    NAB_NEEDLESS_AUTOBOXING_VALUEOF,
    NAB_NEEDLESS_BOOLEAN_CONSTANT_CONVERSION,
    NAB_NEEDLESS_BOXING_PARSE,
    NAB_NEEDLESS_BOXING_STRING_CTOR,
    NAB_NEEDLESS_BOXING_VALUEOF,
    NAB_NEEDLESS_BOX_TO_CAST,
    NAB_NEEDLESS_BOX_TO_UNBOX,
    NCMU_NON_COLLECTION_METHOD_USE,
    NCS_NEEDLESS_CUSTOM_SERIALIZATION,
    NFF_NON_FUNCTIONAL_FIELD,
    NIR_NEEDLESS_INSTANCE_RETRIEVAL,
    NMCS_NEEDLESS_MEMBER_COLLECTION_SYNCHRONIZATION,
    NOS_NON_OWNED_SYNCHRONIZATION,
    NPMC_NON_PRODUCTIVE_METHOD_CALL,
    NRTL_NON_RECYCLEABLE_TAG_LIB,
    NSE_NON_SYMMETRIC_EQUALS,

    OC_OVERZEALOUS_CASTING,
    OCP_OVERLY_CONCRETE_PARAMETER,
    ODN_ORPHANED_DOM_NODE,
    OI_OPTIONAL_ISSUES_CHECKING_REFERENCE,
    OI_OPTIONAL_ISSUES_PRIMITIVE_VARIANT_PREFERRED,
    OI_OPTIONAL_ISSUES_USES_DELAYED_EXECUTION,
    OI_OPTIONAL_ISSUES_USES_IMMEDIATE_EXECUTION,
    OI_OPTIONAL_ISSUES_USES_ORELSEGET_WITH_NULL,
    OPM_OVERLY_PERMISSIVE_METHOD,

    PCAIL_POSSIBLE_CONSTANT_ALLOCATION_IN_LOOP,
    PCOA_PARTIALLY_CONSTRUCTED_OBJECT_ACCESS,
    PDP_POORLY_DEFINED_PARAMETER,
    PIS_POSSIBLE_INCOMPLETE_SERIALIZATION,
    PL_PARALLEL_LISTS,
    PMB_INSTANCE_BASED_THREAD_LOCAL,
    PMB_LOCAL_BASED_JAXB_CONTEXT,
    PMB_POSSIBLE_MEMORY_BLOAT,
    PME_POOR_MANS_ENUM,
    PRMC_POSSIBLY_REDUNDANT_METHOD_CALLS,
    PSC_PRESIZE_COLLECTIONS,
    PSC_SUBOPTIMAL_COLLECTION_SIZING,
    PUS_POSSIBLE_UNSUSPECTED_SERIALIZATION,

    RFI_SET_ACCESSIBLE,
    ROOM_REFLECTION_ON_OBJECT_METHODS,

    S508C_APPENDED_STRING,
    S508C_NON_ACCESSIBLE_JCOMPONENT,
    S508C_NON_TRANSLATABLE_STRING,
    S508C_NO_SETLABELFOR,
    S508C_NO_SETSIZE,
    S508C_NULL_LAYOUT,
    S508C_SET_COMP_COLOR,
    SACM_STATIC_ARRAY_CREATED_IN_METHOD,
    SAT_SUSPICIOUS_ARGUMENT_TYPES,
    SCA_SUSPICIOUS_CLONE_ALGORITHM,
    SCII_SPOILED_CHILD_INTERFACE_IMPLEMENTOR,
    SCI_SYNCHRONIZED_COLLECTION_ITERATORS,
    SCR_SLOPPY_CLASS_REFLECTION,
    SCSS_SUSPICIOUS_CLUSTERED_SESSION_SUPPORT,
    SCRV_SUSPICIOUS_COMPARATOR_RETURN_VALUES,
    SEC_SIDE_EFFECT_CONSTRUCTOR,
    SEO_SUBOPTIMAL_EXPRESSION_ORDER,
    SG_SLUGGISH_GUI,
    SGSU_SUSPICIOUS_GETTER_SETTER_USE,
    SIL_SQL_IN_LOOP,
    SJVU_SUSPICIOUS_JDK_VERSION_USE,
    SMA_STUTTERED_METHOD_ARGUMENTS,
    SMII_STATIC_METHOD_INSTANCE_INVOCATION,
    SNG_SUSPICIOUS_NULL_FIELD_GUARD,
    SNG_SUSPICIOUS_NULL_LOCAL_GUARD,
    SPP_CONVERSION_OF_STRING_LITERAL,
    SPP_USE_ZERO_WITH_COMPARATOR,
    SPP_DOUBLE_APPENDED_LITERALS,
    SPP_EMPTY_CASING,
    SPP_EQUALS_ON_ENUM,
    SPP_EQUALS_ON_STRING_BUILDER,
    SPP_INTERN_ON_CONSTANT,
    SPP_INVALID_BOOLEAN_NULL_CHECK,
    SPP_INVALID_CALENDAR_COMPARE,
    SPP_NEGATIVE_BITSET_ITEM,
    SPP_NO_CHAR_SB_CTOR,
    SPP_NON_ARRAY_PARM,
    SPP_NON_USEFUL_TOSTRING,
    SPP_NULL_BEFORE_INSTANCEOF,
    SPP_SERIALVER_SHOULD_BE_PRIVATE,
    SPP_STATIC_FORMAT_STRING,
    SPP_STRINGBUFFER_WITH_EMPTY_STRING,
    SPP_STRINGBUILDER_IS_MUTABLE,
    SPP_STUTTERED_ASSIGNMENT,
    SPP_SUSPECT_STRING_TEST,
    SPP_TEMPORARY_TRIM,
    SPP_TOSTRING_ON_STRING,
    SPP_USE_BIGDECIMAL_STRING_CTOR,
    SPP_USE_CHARAT,
    SPP_USE_GET0,
    SPP_USE_GETPROPERTY,
    SPP_USE_ISEMPTY,
    SPP_USE_ISNAN,
    SPP_USELESS_CASING,
    SPP_USELESS_TERNARY,
    SPP_USE_MATH_CONSTANT,
    SPP_USE_STRINGBUILDER_LENGTH,
    SPP_WRONG_COMMONS_TO_STRING_OBJECT,
    SPP_PASSING_THIS_AS_PARM,
    SLS_SUSPICIOUS_LOOP_SEARCH,
    SSCU_SUSPICIOUS_SHADED_CLASS_USE,
    STB_STACKED_TRY_BLOCKS,
    STS_SPURIOUS_THREAD_STATES,
    STT_STRING_PARSING_A_FIELD,
    STT_TOSTRING_MAP_KEYING,
    STT_TOSTRING_STORED_IN_FIELD,
    SUA_SUSPICIOUS_UNINITIALIZED_ARRAY,
    SUI_CONTAINS_BEFORE_ADD,
    SUI_CONTAINS_BEFORE_REMOVE,
    SWCO_SUSPICIOUS_WAIT_ON_CONCURRENT_OBJECT,

    TBP_TRISTATE_BOOLEAN_PATTERN,
    TR_TAIL_RECURSION,

    UAA_USE_ADD_ALL,
    UAC_UNNECESSARY_API_CONVERSION_DATE_TO_INSTANT,
    UAC_UNNECESSARY_API_CONVERSION_FILE_TO_PATH,
    UCC_UNRELATED_COLLECTION_CONTENTS,
    UCPM_USE_CHARACTER_PARAMETERIZED_METHOD,
    UEC_USE_ENUM_COLLECTIONS,
    UJM_UNJITABLE_METHOD,
    UMTP_UNBOUND_METHOD_TEMPLATE_PARAMETER,
    UNNC_UNNECESSARY_NEW_NULL_CHECK,
    UP_UNUSED_PARAMETER,
    URV_CHANGE_RETURN_TYPE,
    URV_INHERITED_METHOD_WITH_RELATED_TYPES,
    URV_UNRELATED_RETURN_VALUES,
    USBR_UNNECESSARY_STORE_BEFORE_RETURN,
    USFW_UNSYNCHRONIZED_SINGLETON_FIELD_WRITES,
    USS_USE_STRING_SPLIT,
    UTAO_JUNIT_ASSERTION_ODDITIES_ACTUAL_CONSTANT,
    UTAO_JUNIT_ASSERTION_ODDITIES_ASSERT_USED,
    UTAO_JUNIT_ASSERTION_ODDITIES_BOOLEAN_ASSERT,
    UTAO_JUNIT_ASSERTION_ODDITIES_IMPOSSIBLE_NULL,
    UTAO_JUNIT_ASSERTION_ODDITIES_INEXACT_DOUBLE,
    UTAO_JUNIT_ASSERTION_ODDITIES_USE_ASSERT_NULL,
    UTAO_JUNIT_ASSERTION_ODDITIES_USE_ASSERT_NOT_NULL,
    UTAO_JUNIT_ASSERTION_ODDITIES_USE_ASSERT_EQUALS,
    UTAO_JUNIT_ASSERTION_ODDITIES_USE_ASSERT_NOT_EQUALS,
    UTAO_JUNIT_ASSERTION_ODDITIES_NO_ASSERT,
    UTAO_JUNIT_ASSERTION_ODDITIES_USING_DEPRECATED,
    UTAO_TESTNG_ASSERTION_ODDITIES_ACTUAL_CONSTANT,
    UTAO_TESTNG_ASSERTION_ODDITIES_ASSERT_USED,
    UTAO_TESTNG_ASSERTION_ODDITIES_BOOLEAN_ASSERT,
    UTAO_TESTNG_ASSERTION_ODDITIES_IMPOSSIBLE_NULL,
    UTAO_TESTNG_ASSERTION_ODDITIES_INEXACT_DOUBLE,
    UTAO_TESTNG_ASSERTION_ODDITIES_USE_ASSERT_NULL,
    UTAO_TESTNG_ASSERTION_ODDITIES_USE_ASSERT_NOT_NULL,
    UTAO_TESTNG_ASSERTION_ODDITIES_USE_ASSERT_EQUALS,
    UTAO_TESTNG_ASSERTION_ODDITIES_USE_ASSERT_NOT_EQUALS,
    UTAO_TESTNG_ASSERTION_ODDITIES_NO_ASSERT,
    UTA_USE_TO_ARRAY,
    UVA_USE_VAR_ARGS,
    UTWR_USE_TRY_WITH_RESOURCES,

    WEM_OBSCURING_EXCEPTION,
    WEM_WEAK_EXCEPTION_MESSAGING,
    WI_DUPLICATE_WIRED_TYPES,
    WI_MANUALLY_ALLOCATING_AN_AUTOWIRED_BEAN,
    WI_WIRING_OF_STATIC_FIELD,
    WOC_WRITE_ONLY_COLLECTION_FIELD,
    WOC_WRITE_ONLY_COLLECTION_LOCAL;
    // @formatter:on
}
