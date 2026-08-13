.class public LR7/E;
.super LR7/B;
.source "SourceFile"

# interfaces
.implements LO7/W;


# instance fields
.field private O:LO7/j0;

.field private final P:LO7/W;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LO7/U;LP7/g;LO7/D;LO7/u;ZZZLO7/b$a;LO7/W;LO7/a0;)V
    .locals 11

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LR7/E;->M(I)V

    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LR7/E;->M(I)V

    :cond_1
    if-nez p3, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, LR7/E;->M(I)V

    :cond_2
    if-nez p4, :cond_3

    const/4 v0, 0x3

    invoke-static {v0}, LR7/E;->M(I)V

    :cond_3
    if-nez p8, :cond_4

    const/4 v0, 0x4

    invoke-static {v0}, LR7/E;->M(I)V

    :cond_4
    if-nez p10, :cond_5

    const/4 v0, 0x5

    invoke-static {v0}, LR7/E;->M(I)V

    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<set-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ln8/f;->s(Ljava/lang/String;)Ln8/f;

    move-result-object v5

    move-object v0, p0

    move-object v1, p3

    move-object v2, p4

    move-object v3, p1

    move-object v4, p2

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, LR7/B;-><init>(LO7/D;LO7/u;LO7/U;LP7/g;Ln8/f;ZZZLO7/b$a;LO7/a0;)V

    if-eqz p9, :cond_6

    move-object v1, p0

    move-object/from16 v0, p9

    goto :goto_0

    :cond_6
    move-object v0, p0

    move-object v1, v0

    :goto_0
    iput-object v0, v1, LR7/E;->P:LO7/W;

    return-void
.end method

.method private static synthetic M(I)V
    .locals 6

    .prologue
    packed-switch p0, :pswitch_data_0

    const-string v0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :pswitch_0
    const-string v0, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v1, 0x2

    packed-switch p0, :pswitch_data_1

    const/4 v2, 0x3

    goto :goto_1

    :pswitch_1
    move v2, v1

    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl"

    const/4 v4, 0x0

    packed-switch p0, :pswitch_data_2

    const-string v5, "correspondingProperty"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_2
    aput-object v3, v2, v4

    goto :goto_2

    :pswitch_3
    const-string v5, "type"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_4
    const-string v5, "setterDescriptor"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_5
    const-string v5, "parameter"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_6
    const-string v5, "source"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_7
    const-string v5, "kind"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_8
    const-string v5, "visibility"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_9
    const-string v5, "modality"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_a
    const-string v5, "annotations"

    aput-object v5, v2, v4

    :goto_2
    const/4 v4, 0x1

    packed-switch p0, :pswitch_data_3

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_b
    const-string v3, "getOriginal"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_c
    const-string v3, "getReturnType"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_d
    const-string v3, "getValueParameters"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_e
    const-string v3, "getOverriddenDescriptors"

    aput-object v3, v2, v4

    :goto_3
    packed-switch p0, :pswitch_data_4

    const-string v3, "<init>"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_f
    const-string v3, "createSetterParameter"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_10
    const-string v3, "initialize"

    aput-object v3, v2, v1

    :goto_4
    :pswitch_11
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    packed-switch p0, :pswitch_data_5

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :pswitch_12
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

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
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_a
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0xa
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x6
        :pswitch_10
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0xa
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
    .end packed-switch
.end method

.method public static X0(LO7/W;LF8/E;LP7/g;)LR7/L;
    .locals 13

    .prologue
    if-nez p0, :cond_0

    const/4 v0, 0x7

    invoke-static {v0}, LR7/E;->M(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x8

    invoke-static {v0}, LR7/E;->M(I)V

    :cond_1
    if-nez p2, :cond_2

    const/16 v0, 0x9

    invoke-static {v0}, LR7/E;->M(I)V

    :cond_2
    new-instance v0, LR7/L;

    sget-object v6, Ln8/h;->n:Ln8/f;

    const/4 v11, 0x0

    sget-object v12, LO7/a0;->a:LO7/a0;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v5, p2

    move-object v7, p1

    invoke-direct/range {v1 .. v12}, LR7/L;-><init>(LO7/a;LO7/j0;ILP7/g;Ln8/f;LF8/E;ZZZLF8/E;LO7/a0;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic J0()LO7/p;
    .locals 1

    invoke-virtual {p0}, LR7/E;->Y0()LO7/W;

    move-result-object v0

    return-object v0
.end method

.method public Y0()LO7/W;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/E;->P:LO7/W;

    if-nez v0, :cond_0

    const/16 v1, 0xd

    invoke-static {v1}, LR7/E;->M(I)V

    :cond_0
    return-object v0
.end method

.method public Z0(LO7/j0;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x6

    invoke-static {v0}, LR7/E;->M(I)V

    :cond_0
    iput-object p1, p0, LR7/E;->O:LO7/j0;

    return-void
.end method

.method public bridge synthetic a()LO7/a;
    .locals 1

    invoke-virtual {p0}, LR7/E;->Y0()LO7/W;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LO7/b;
    .locals 1

    invoke-virtual {p0}, LR7/E;->Y0()LO7/W;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LO7/m;
    .locals 1

    invoke-virtual {p0}, LR7/E;->Y0()LO7/W;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LO7/y;
    .locals 1

    invoke-virtual {p0}, LR7/E;->Y0()LO7/W;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/util/Collection;
    .locals 2

    .prologue
    const/4 v0, 0x0

    invoke-super {p0, v0}, LR7/B;->T0(Z)Ljava/util/Collection;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0xa

    invoke-static {v1}, LR7/E;->M(I)V

    :cond_0
    return-object v0
.end method

.method public l()LF8/E;
    .locals 2

    .prologue
    invoke-static {p0}, Lv8/c;->j(LO7/m;)LL7/g;

    move-result-object v0

    invoke-virtual {v0}, LL7/g;->Z()LF8/M;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0xc

    invoke-static {v1}, LR7/E;->M(I)V

    :cond_0
    return-object v0
.end method

.method public n()Ljava/util/List;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/E;->O:LO7/j0;

    if-eqz v0, :cond_1

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0xb

    invoke-static {v1}, LR7/E;->M(I)V

    :cond_0
    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public r0(LO7/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, LO7/o;->a(LO7/W;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
