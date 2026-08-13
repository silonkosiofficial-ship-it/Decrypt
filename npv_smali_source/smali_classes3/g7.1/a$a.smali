.class public final enum Lg7/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg7/a$a$a;
    }
.end annotation


# static fields
.field public static final D:Lg7/a$a$a;

.field private static final E:Ljava/util/Map;

.field public static final F:Lg7/a$a;

.field public static final enum G:Lg7/a$a;

.field public static final enum H:Lg7/a$a;

.field public static final enum I:Lg7/a$a;

.field public static final enum J:Lg7/a$a;

.field public static final enum K:Lg7/a$a;

.field public static final enum L:Lg7/a$a;

.field public static final enum M:Lg7/a$a;

.field public static final enum N:Lg7/a$a;

.field public static final enum O:Lg7/a$a;

.field public static final enum P:Lg7/a$a;

.field public static final enum Q:Lg7/a$a;

.field public static final enum R:Lg7/a$a;

.field private static final synthetic S:[Lg7/a$a;

.field private static final synthetic T:Lp7/a;


# instance fields
.field private final C:S


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    new-instance v0, Lg7/a$a;

    const/4 v1, 0x0

    const/16 v2, 0x3e8

    const-string v3, "NORMAL"

    invoke-direct {v0, v3, v1, v2}, Lg7/a$a;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lg7/a$a;->G:Lg7/a$a;

    new-instance v0, Lg7/a$a;

    const/4 v1, 0x1

    const/16 v2, 0x3e9

    const-string v3, "GOING_AWAY"

    invoke-direct {v0, v3, v1, v2}, Lg7/a$a;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lg7/a$a;->H:Lg7/a$a;

    new-instance v0, Lg7/a$a;

    const/4 v1, 0x2

    const/16 v2, 0x3ea

    const-string v3, "PROTOCOL_ERROR"

    invoke-direct {v0, v3, v1, v2}, Lg7/a$a;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lg7/a$a;->I:Lg7/a$a;

    new-instance v0, Lg7/a$a;

    const/4 v1, 0x3

    const/16 v2, 0x3eb

    const-string v3, "CANNOT_ACCEPT"

    invoke-direct {v0, v3, v1, v2}, Lg7/a$a;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lg7/a$a;->J:Lg7/a$a;

    new-instance v0, Lg7/a$a;

    const/4 v1, 0x4

    const/16 v2, 0x3ee

    const-string v3, "CLOSED_ABNORMALLY"

    invoke-direct {v0, v3, v1, v2}, Lg7/a$a;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lg7/a$a;->K:Lg7/a$a;

    new-instance v0, Lg7/a$a;

    const/4 v1, 0x5

    const/16 v2, 0x3ef

    const-string v3, "NOT_CONSISTENT"

    invoke-direct {v0, v3, v1, v2}, Lg7/a$a;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lg7/a$a;->L:Lg7/a$a;

    new-instance v0, Lg7/a$a;

    const/4 v1, 0x6

    const/16 v2, 0x3f0

    const-string v3, "VIOLATED_POLICY"

    invoke-direct {v0, v3, v1, v2}, Lg7/a$a;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lg7/a$a;->M:Lg7/a$a;

    new-instance v0, Lg7/a$a;

    const/4 v1, 0x7

    const/16 v2, 0x3f1

    const-string v3, "TOO_BIG"

    invoke-direct {v0, v3, v1, v2}, Lg7/a$a;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lg7/a$a;->N:Lg7/a$a;

    new-instance v0, Lg7/a$a;

    const/16 v1, 0x8

    const/16 v2, 0x3f2

    const-string v3, "NO_EXTENSION"

    invoke-direct {v0, v3, v1, v2}, Lg7/a$a;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lg7/a$a;->O:Lg7/a$a;

    new-instance v0, Lg7/a$a;

    const/16 v1, 0x9

    const/16 v2, 0x3f3

    const-string v3, "INTERNAL_ERROR"

    invoke-direct {v0, v3, v1, v2}, Lg7/a$a;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lg7/a$a;->P:Lg7/a$a;

    new-instance v0, Lg7/a$a;

    const/16 v1, 0x3f4

    const-string v2, "SERVICE_RESTART"

    const/16 v3, 0xa

    invoke-direct {v0, v2, v3, v1}, Lg7/a$a;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lg7/a$a;->Q:Lg7/a$a;

    new-instance v0, Lg7/a$a;

    const/16 v1, 0xb

    const/16 v2, 0x3f5

    const-string v4, "TRY_AGAIN_LATER"

    invoke-direct {v0, v4, v1, v2}, Lg7/a$a;-><init>(Ljava/lang/String;IS)V

    sput-object v0, Lg7/a$a;->R:Lg7/a$a;

    invoke-static {}, Lg7/a$a;->e()[Lg7/a$a;

    move-result-object v0

    sput-object v0, Lg7/a$a;->S:[Lg7/a$a;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Lg7/a$a;->T:Lp7/a;

    new-instance v0, Lg7/a$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg7/a$a$a;-><init>(Ly7/k;)V

    sput-object v0, Lg7/a$a;->D:Lg7/a$a$a;

    invoke-static {}, Lg7/a$a;->m()Lp7/a;

    move-result-object v0

    invoke-static {v0, v3}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lj7/S;->d(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, LE7/j;->d(II)I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lg7/a$a;

    iget-short v3, v3, Lg7/a$a;->C:S

    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sput-object v2, Lg7/a$a;->E:Ljava/util/Map;

    sget-object v0, Lg7/a$a;->P:Lg7/a$a;

    sput-object v0, Lg7/a$a;->F:Lg7/a$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IS)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-short p3, p0, Lg7/a$a;->C:S

    return-void
.end method

.method private static final synthetic e()[Lg7/a$a;
    .locals 3

    const/16 v0, 0xc

    new-array v0, v0, [Lg7/a$a;

    sget-object v1, Lg7/a$a;->G:Lg7/a$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lg7/a$a;->H:Lg7/a$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lg7/a$a;->I:Lg7/a$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lg7/a$a;->J:Lg7/a$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lg7/a$a;->K:Lg7/a$a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lg7/a$a;->L:Lg7/a$a;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lg7/a$a;->M:Lg7/a$a;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lg7/a$a;->N:Lg7/a$a;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lg7/a$a;->O:Lg7/a$a;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lg7/a$a;->P:Lg7/a$a;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lg7/a$a;->Q:Lg7/a$a;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lg7/a$a;->R:Lg7/a$a;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static final synthetic g()Ljava/util/Map;
    .locals 1

    sget-object v0, Lg7/a$a;->E:Ljava/util/Map;

    return-object v0
.end method

.method public static m()Lp7/a;
    .locals 1

    sget-object v0, Lg7/a$a;->T:Lp7/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lg7/a$a;
    .locals 1

    const-class v0, Lg7/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg7/a$a;

    return-object p0
.end method

.method public static values()[Lg7/a$a;
    .locals 1

    sget-object v0, Lg7/a$a;->S:[Lg7/a$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg7/a$a;

    return-object v0
.end method


# virtual methods
.method public final i()S
    .locals 1

    iget-short v0, p0, Lg7/a$a;->C:S

    return v0
.end method
