.class public final enum Lw8/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum G:Lw8/e;

.field public static final enum H:Lw8/e;

.field public static final enum I:Lw8/e;

.field public static final enum J:Lw8/e;

.field public static final enum K:Lw8/e;

.field public static final enum L:Lw8/e;

.field public static final enum M:Lw8/e;

.field public static final enum N:Lw8/e;

.field private static final O:Ljava/util/Set;

.field private static final P:Ljava/util/Map;

.field private static final Q:Ljava/util/Map;

.field private static final R:Ljava/util/Map;

.field private static final synthetic S:[Lw8/e;


# instance fields
.field private final C:LL7/h;

.field private final D:Ljava/lang/String;

.field private final E:Ljava/lang/String;

.field private final F:Ln8/c;


# direct methods
.method static constructor <clinit>()V
    .locals 22

    .prologue
    new-instance v7, Lw8/e;

    sget-object v3, LL7/h;->I:LL7/h;

    const-string v5, "Z"

    const-string v6, "java.lang.Boolean"

    const-string v1, "BOOLEAN"

    const/4 v2, 0x0

    const-string v4, "boolean"

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lw8/e;-><init>(Ljava/lang/String;ILL7/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v7, Lw8/e;->G:Lw8/e;

    new-instance v0, Lw8/e;

    sget-object v11, LL7/h;->J:LL7/h;

    const-string v13, "C"

    const-string v14, "java.lang.Character"

    const-string v9, "CHAR"

    const/4 v10, 0x1

    const-string v12, "char"

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Lw8/e;-><init>(Ljava/lang/String;ILL7/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lw8/e;->H:Lw8/e;

    new-instance v1, Lw8/e;

    sget-object v18, LL7/h;->K:LL7/h;

    const-string v20, "B"

    const-string v21, "java.lang.Byte"

    const-string v16, "BYTE"

    const/16 v17, 0x2

    const-string v19, "byte"

    move-object v15, v1

    invoke-direct/range {v15 .. v21}, Lw8/e;-><init>(Ljava/lang/String;ILL7/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v1, Lw8/e;->I:Lw8/e;

    new-instance v2, Lw8/e;

    sget-object v11, LL7/h;->L:LL7/h;

    const-string v13, "S"

    const-string v14, "java.lang.Short"

    const-string v9, "SHORT"

    const/4 v10, 0x3

    const-string v12, "short"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, Lw8/e;-><init>(Ljava/lang/String;ILL7/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v2, Lw8/e;->J:Lw8/e;

    new-instance v3, Lw8/e;

    sget-object v18, LL7/h;->M:LL7/h;

    const-string v20, "I"

    const-string v21, "java.lang.Integer"

    const-string v16, "INT"

    const/16 v17, 0x4

    const-string v19, "int"

    move-object v15, v3

    invoke-direct/range {v15 .. v21}, Lw8/e;-><init>(Ljava/lang/String;ILL7/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v3, Lw8/e;->K:Lw8/e;

    new-instance v4, Lw8/e;

    sget-object v11, LL7/h;->N:LL7/h;

    const-string v13, "F"

    const-string v14, "java.lang.Float"

    const-string v9, "FLOAT"

    const/4 v10, 0x5

    const-string v12, "float"

    move-object v8, v4

    invoke-direct/range {v8 .. v14}, Lw8/e;-><init>(Ljava/lang/String;ILL7/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v4, Lw8/e;->L:Lw8/e;

    new-instance v5, Lw8/e;

    sget-object v18, LL7/h;->O:LL7/h;

    const-string v20, "J"

    const-string v21, "java.lang.Long"

    const-string v16, "LONG"

    const/16 v17, 0x6

    const-string v19, "long"

    move-object v15, v5

    invoke-direct/range {v15 .. v21}, Lw8/e;-><init>(Ljava/lang/String;ILL7/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v5, Lw8/e;->M:Lw8/e;

    new-instance v6, Lw8/e;

    sget-object v11, LL7/h;->P:LL7/h;

    const-string v13, "D"

    const-string v14, "java.lang.Double"

    const-string v9, "DOUBLE"

    const/4 v10, 0x7

    const-string v12, "double"

    move-object v8, v6

    invoke-direct/range {v8 .. v14}, Lw8/e;-><init>(Ljava/lang/String;ILL7/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v6, Lw8/e;->N:Lw8/e;

    const/16 v8, 0x8

    new-array v8, v8, [Lw8/e;

    const/4 v9, 0x0

    aput-object v7, v8, v9

    const/4 v7, 0x1

    aput-object v0, v8, v7

    const/4 v0, 0x2

    aput-object v1, v8, v0

    const/4 v0, 0x3

    aput-object v2, v8, v0

    const/4 v0, 0x4

    aput-object v3, v8, v0

    const/4 v0, 0x5

    aput-object v4, v8, v0

    const/4 v0, 0x6

    aput-object v5, v8, v0

    const/4 v0, 0x7

    aput-object v6, v8, v0

    sput-object v8, Lw8/e;->S:[Lw8/e;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lw8/e;->O:Ljava/util/Set;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lw8/e;->P:Ljava/util/Map;

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, LL7/h;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lw8/e;->Q:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lw8/e;->R:Ljava/util/Map;

    invoke-static {}, Lw8/e;->values()[Lw8/e;

    move-result-object v0

    array-length v1, v0

    :goto_0
    if-ge v9, v1, :cond_0

    aget-object v2, v0, v9

    sget-object v3, Lw8/e;->O:Ljava/util/Set;

    invoke-virtual {v2}, Lw8/e;->q()Ln8/c;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v3, Lw8/e;->P:Ljava/util/Map;

    invoke-virtual {v2}, Lw8/e;->n()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lw8/e;->Q:Ljava/util/Map;

    invoke-virtual {v2}, Lw8/e;->o()LL7/h;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lw8/e;->R:Ljava/util/Map;

    invoke-virtual {v2}, Lw8/e;->m()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/2addr v9, v7

    goto :goto_0

    :cond_0
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILL7/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    if-nez p3, :cond_0

    const/4 v0, 0x6

    invoke-static {v0}, Lw8/e;->e(I)V

    :cond_0
    if-nez p4, :cond_1

    const/4 v0, 0x7

    invoke-static {v0}, Lw8/e;->e(I)V

    :cond_1
    if-nez p5, :cond_2

    const/16 v0, 0x8

    invoke-static {v0}, Lw8/e;->e(I)V

    :cond_2
    if-nez p6, :cond_3

    const/16 v0, 0x9

    invoke-static {v0}, Lw8/e;->e(I)V

    :cond_3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lw8/e;->C:LL7/h;

    iput-object p4, p0, Lw8/e;->D:Ljava/lang/String;

    iput-object p5, p0, Lw8/e;->E:Ljava/lang/String;

    new-instance p1, Ln8/c;

    invoke-direct {p1, p6}, Ln8/c;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lw8/e;->F:Ln8/c;

    return-void
.end method

.method private static synthetic e(I)V
    .locals 7

    .prologue
    const/4 v0, 0x4

    const/4 v1, 0x2

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    const-string v2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    :pswitch_0
    const-string v2, "@NotNull method %s.%s must not return null"

    :goto_0
    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    packed-switch p0, :pswitch_data_1

    const/4 v3, 0x3

    goto :goto_1

    :cond_1
    :pswitch_1
    move v3, v1

    :goto_1
    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType"

    const/4 v5, 0x0

    packed-switch p0, :pswitch_data_2

    const-string v6, "className"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_2
    const-string v6, "wrapperClassName"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_3
    const-string v6, "primitiveType"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_4
    const-string v6, "desc"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_5
    const-string v6, "type"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_6
    aput-object v4, v3, v5

    goto :goto_2

    :pswitch_7
    const-string v6, "name"

    aput-object v6, v3, v5

    :goto_2
    const-string v5, "get"

    const/4 v6, 0x1

    if-eq p0, v1, :cond_2

    if-eq p0, v0, :cond_2

    packed-switch p0, :pswitch_data_3

    aput-object v4, v3, v6

    goto :goto_3

    :pswitch_8
    const-string v4, "getWrapperFqName"

    aput-object v4, v3, v6

    goto :goto_3

    :pswitch_9
    const-string v4, "getDesc"

    aput-object v4, v3, v6

    goto :goto_3

    :pswitch_a
    const-string v4, "getJavaKeywordName"

    aput-object v4, v3, v6

    goto :goto_3

    :pswitch_b
    const-string v4, "getPrimitiveType"

    aput-object v4, v3, v6

    goto :goto_3

    :cond_2
    aput-object v5, v3, v6

    :goto_3
    packed-switch p0, :pswitch_data_4

    const-string v4, "isWrapperClassName"

    aput-object v4, v3, v1

    goto :goto_4

    :pswitch_c
    const-string v4, "<init>"

    aput-object v4, v3, v1

    goto :goto_4

    :pswitch_d
    const-string v4, "getByDesc"

    aput-object v4, v3, v1

    goto :goto_4

    :pswitch_e
    aput-object v5, v3, v1

    :goto_4
    :pswitch_f
    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_3

    packed-switch p0, :pswitch_data_5

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_3
    :pswitch_10
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xa
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_4
        :pswitch_3
        :pswitch_7
        :pswitch_4
        :pswitch_2
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0xa
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_e
        :pswitch_f
        :pswitch_e
        :pswitch_f
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0xa
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
    .end packed-switch
.end method

.method public static g(LL7/h;)Lw8/e;
    .locals 1

    .prologue
    if-nez p0, :cond_0

    const/4 v0, 0x3

    invoke-static {v0}, Lw8/e;->e(I)V

    :cond_0
    sget-object v0, Lw8/e;->Q:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lw8/e;

    if-nez p0, :cond_1

    const/4 v0, 0x4

    invoke-static {v0}, Lw8/e;->e(I)V

    :cond_1
    return-object p0
.end method

.method public static i(Ljava/lang/String;)Lw8/e;
    .locals 3

    .prologue
    if-nez p0, :cond_0

    const/4 v0, 0x1

    invoke-static {v0}, Lw8/e;->e(I)V

    :cond_0
    sget-object v0, Lw8/e;->P:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw8/e;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Non-primitive type name passed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lw8/e;
    .locals 1

    const-class v0, Lw8/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw8/e;

    return-object p0
.end method

.method public static values()[Lw8/e;
    .locals 1

    sget-object v0, Lw8/e;->S:[Lw8/e;

    invoke-virtual {v0}, [Lw8/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw8/e;

    return-object v0
.end method


# virtual methods
.method public m()Ljava/lang/String;
    .locals 2

    .prologue
    iget-object v0, p0, Lw8/e;->E:Ljava/lang/String;

    if-nez v0, :cond_0

    const/16 v1, 0xc

    invoke-static {v1}, Lw8/e;->e(I)V

    :cond_0
    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 2

    .prologue
    iget-object v0, p0, Lw8/e;->D:Ljava/lang/String;

    if-nez v0, :cond_0

    const/16 v1, 0xb

    invoke-static {v1}, Lw8/e;->e(I)V

    :cond_0
    return-object v0
.end method

.method public o()LL7/h;
    .locals 2

    .prologue
    iget-object v0, p0, Lw8/e;->C:LL7/h;

    if-nez v0, :cond_0

    const/16 v1, 0xa

    invoke-static {v1}, Lw8/e;->e(I)V

    :cond_0
    return-object v0
.end method

.method public q()Ln8/c;
    .locals 2

    .prologue
    iget-object v0, p0, Lw8/e;->F:Ln8/c;

    if-nez v0, :cond_0

    const/16 v1, 0xd

    invoke-static {v1}, Lw8/e;->e(I)V

    :cond_0
    return-object v0
.end method
