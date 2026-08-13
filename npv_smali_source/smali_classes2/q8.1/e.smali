.class public final enum Lq8/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq8/e$a;
    }
.end annotation


# static fields
.field public static final D:Lq8/e$a;

.field public static final E:Ljava/util/Set;

.field public static final F:Ljava/util/Set;

.field public static final enum G:Lq8/e;

.field public static final enum H:Lq8/e;

.field public static final enum I:Lq8/e;

.field public static final enum J:Lq8/e;

.field public static final enum K:Lq8/e;

.field public static final enum L:Lq8/e;

.field public static final enum M:Lq8/e;

.field public static final enum N:Lq8/e;

.field public static final enum O:Lq8/e;

.field public static final enum P:Lq8/e;

.field public static final enum Q:Lq8/e;

.field public static final enum R:Lq8/e;

.field public static final enum S:Lq8/e;

.field public static final enum T:Lq8/e;

.field private static final synthetic U:[Lq8/e;

.field private static final synthetic V:Lp7/a;


# instance fields
.field private final C:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    new-instance v0, Lq8/e;

    const-string v1, "VISIBILITY"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lq8/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lq8/e;->G:Lq8/e;

    new-instance v0, Lq8/e;

    const-string v1, "MODALITY"

    invoke-direct {v0, v1, v3, v3}, Lq8/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lq8/e;->H:Lq8/e;

    new-instance v0, Lq8/e;

    const-string v1, "OVERRIDE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v3}, Lq8/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lq8/e;->I:Lq8/e;

    new-instance v0, Lq8/e;

    const-string v1, "ANNOTATIONS"

    const/4 v4, 0x3

    invoke-direct {v0, v1, v4, v2}, Lq8/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lq8/e;->J:Lq8/e;

    new-instance v0, Lq8/e;

    const-string v1, "INNER"

    const/4 v4, 0x4

    invoke-direct {v0, v1, v4, v3}, Lq8/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lq8/e;->K:Lq8/e;

    new-instance v0, Lq8/e;

    const-string v1, "MEMBER_KIND"

    const/4 v4, 0x5

    invoke-direct {v0, v1, v4, v3}, Lq8/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lq8/e;->L:Lq8/e;

    new-instance v0, Lq8/e;

    const-string v1, "DATA"

    const/4 v4, 0x6

    invoke-direct {v0, v1, v4, v3}, Lq8/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lq8/e;->M:Lq8/e;

    new-instance v0, Lq8/e;

    const-string v1, "INLINE"

    const/4 v4, 0x7

    invoke-direct {v0, v1, v4, v3}, Lq8/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lq8/e;->N:Lq8/e;

    new-instance v0, Lq8/e;

    const-string v1, "EXPECT"

    const/16 v4, 0x8

    invoke-direct {v0, v1, v4, v3}, Lq8/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lq8/e;->O:Lq8/e;

    new-instance v0, Lq8/e;

    const-string v1, "ACTUAL"

    const/16 v4, 0x9

    invoke-direct {v0, v1, v4, v3}, Lq8/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lq8/e;->P:Lq8/e;

    new-instance v0, Lq8/e;

    const-string v1, "CONST"

    const/16 v4, 0xa

    invoke-direct {v0, v1, v4, v3}, Lq8/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lq8/e;->Q:Lq8/e;

    new-instance v0, Lq8/e;

    const-string v1, "LATEINIT"

    const/16 v4, 0xb

    invoke-direct {v0, v1, v4, v3}, Lq8/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lq8/e;->R:Lq8/e;

    new-instance v0, Lq8/e;

    const-string v1, "FUN"

    const/16 v4, 0xc

    invoke-direct {v0, v1, v4, v3}, Lq8/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lq8/e;->S:Lq8/e;

    new-instance v0, Lq8/e;

    const-string v1, "VALUE"

    const/16 v4, 0xd

    invoke-direct {v0, v1, v4, v3}, Lq8/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lq8/e;->T:Lq8/e;

    invoke-static {}, Lq8/e;->e()[Lq8/e;

    move-result-object v0

    sput-object v0, Lq8/e;->U:[Lq8/e;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Lq8/e;->V:Lp7/a;

    new-instance v0, Lq8/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lq8/e$a;-><init>(Ly7/k;)V

    sput-object v0, Lq8/e;->D:Lq8/e$a;

    invoke-static {}, Lq8/e;->values()[Lq8/e;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v3, v0

    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v4, v0, v2

    iget-boolean v5, v4, Lq8/e;->C:Z

    if-eqz v5, :cond_0

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lj7/v;->Y0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lq8/e;->E:Ljava/util/Set;

    invoke-static {}, Lq8/e;->values()[Lq8/e;

    move-result-object v0

    invoke-static {v0}, Lj7/n;->d1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lq8/e;->F:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lq8/e;->C:Z

    return-void
.end method

.method private static final synthetic e()[Lq8/e;
    .locals 3

    const/16 v0, 0xe

    new-array v0, v0, [Lq8/e;

    sget-object v1, Lq8/e;->G:Lq8/e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lq8/e;->H:Lq8/e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lq8/e;->I:Lq8/e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lq8/e;->J:Lq8/e;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lq8/e;->K:Lq8/e;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lq8/e;->L:Lq8/e;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lq8/e;->M:Lq8/e;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lq8/e;->N:Lq8/e;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lq8/e;->O:Lq8/e;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lq8/e;->P:Lq8/e;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lq8/e;->Q:Lq8/e;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lq8/e;->R:Lq8/e;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lq8/e;->S:Lq8/e;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lq8/e;->T:Lq8/e;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lq8/e;
    .locals 1

    const-class v0, Lq8/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq8/e;

    return-object p0
.end method

.method public static values()[Lq8/e;
    .locals 1

    sget-object v0, Lq8/e;->U:[Lq8/e;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq8/e;

    return-object v0
.end method
