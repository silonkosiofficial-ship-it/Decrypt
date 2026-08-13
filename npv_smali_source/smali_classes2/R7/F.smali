.class public LR7/F;
.super LR7/c;
.source "SourceFile"


# instance fields
.field private final E:LO7/m;

.field private F:Lz8/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LO7/m;Lz8/g;LP7/g;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LR7/F;->M(I)V

    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LR7/F;->M(I)V

    :cond_1
    if-nez p3, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, LR7/F;->M(I)V

    :cond_2
    sget-object v0, Ln8/h;->h:Ln8/f;

    invoke-direct {p0, p1, p2, p3, v0}, LR7/F;-><init>(LO7/m;Lz8/g;LP7/g;Ln8/f;)V

    return-void
.end method

.method public constructor <init>(LO7/m;Lz8/g;LP7/g;Ln8/f;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x3

    invoke-static {v0}, LR7/F;->M(I)V

    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x4

    invoke-static {v0}, LR7/F;->M(I)V

    :cond_1
    if-nez p3, :cond_2

    const/4 v0, 0x5

    invoke-static {v0}, LR7/F;->M(I)V

    :cond_2
    if-nez p4, :cond_3

    const/4 v0, 0x6

    invoke-static {v0}, LR7/F;->M(I)V

    :cond_3
    invoke-direct {p0, p3, p4}, LR7/c;-><init>(LP7/g;Ln8/f;)V

    iput-object p1, p0, LR7/F;->E:LO7/m;

    iput-object p2, p0, LR7/F;->F:Lz8/g;

    return-void
.end method

.method private static synthetic M(I)V
    .locals 8

    .prologue
    const/16 v0, 0x8

    const/4 v1, 0x7

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v2, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v3, 0x2

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    const/4 v4, 0x3

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl"

    const/4 v6, 0x0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v7, "containingDeclaration"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_1
    const-string v7, "outType"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_2
    const-string v7, "newOwner"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_3
    aput-object v5, v4, v6

    goto :goto_2

    :pswitch_4
    const-string v7, "name"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_5
    const-string v7, "annotations"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_6
    const-string v7, "value"

    aput-object v7, v4, v6

    :goto_2
    const/4 v6, 0x1

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    aput-object v5, v4, v6

    goto :goto_3

    :cond_2
    const-string v5, "getContainingDeclaration"

    aput-object v5, v4, v6

    goto :goto_3

    :cond_3
    const-string v5, "getValue"

    aput-object v5, v4, v6

    :goto_3
    packed-switch p0, :pswitch_data_1

    const-string v5, "<init>"

    aput-object v5, v4, v3

    goto :goto_4

    :pswitch_7
    const-string v5, "setOutType"

    aput-object v5, v4, v3

    goto :goto_4

    :pswitch_8
    const-string v5, "copy"

    aput-object v5, v4, v3

    :goto_4
    :pswitch_9
    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eq p0, v1, :cond_4

    if-eq p0, v0, :cond_4

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch
.end method


# virtual methods
.method public b()LO7/m;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/F;->E:LO7/m;

    if-nez v0, :cond_0

    const/16 v1, 0x8

    invoke-static {v1}, LR7/F;->M(I)V

    :cond_0
    return-object v0
.end method

.method public getValue()Lz8/g;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/F;->F:Lz8/g;

    if-nez v0, :cond_0

    const/4 v1, 0x7

    invoke-static {v1}, LR7/F;->M(I)V

    :cond_0
    return-object v0
.end method
