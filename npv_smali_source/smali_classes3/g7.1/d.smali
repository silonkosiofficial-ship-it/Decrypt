.class public final enum Lg7/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg7/d$a;
    }
.end annotation


# static fields
.field public static final E:Lg7/d$a;

.field private static final F:I

.field private static final G:[Lg7/d;

.field public static final enum H:Lg7/d;

.field public static final enum I:Lg7/d;

.field public static final enum J:Lg7/d;

.field public static final enum K:Lg7/d;

.field public static final enum L:Lg7/d;

.field private static final synthetic M:[Lg7/d;

.field private static final synthetic N:Lp7/a;


# instance fields
.field private final C:Z

.field private final D:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .prologue
    new-instance v0, Lg7/d;

    const-string v1, "TEXT"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v2, v3}, Lg7/d;-><init>(Ljava/lang/String;IZI)V

    sput-object v0, Lg7/d;->H:Lg7/d;

    new-instance v0, Lg7/d;

    const-string v1, "BINARY"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v3, v2, v4}, Lg7/d;-><init>(Ljava/lang/String;IZI)V

    sput-object v0, Lg7/d;->I:Lg7/d;

    new-instance v0, Lg7/d;

    const-string v1, "CLOSE"

    const/16 v5, 0x8

    invoke-direct {v0, v1, v4, v3, v5}, Lg7/d;-><init>(Ljava/lang/String;IZI)V

    sput-object v0, Lg7/d;->J:Lg7/d;

    new-instance v0, Lg7/d;

    const/4 v1, 0x3

    const/16 v4, 0x9

    const-string v5, "PING"

    invoke-direct {v0, v5, v1, v3, v4}, Lg7/d;-><init>(Ljava/lang/String;IZI)V

    sput-object v0, Lg7/d;->K:Lg7/d;

    new-instance v0, Lg7/d;

    const/4 v1, 0x4

    const/16 v4, 0xa

    const-string v5, "PONG"

    invoke-direct {v0, v5, v1, v3, v4}, Lg7/d;-><init>(Ljava/lang/String;IZI)V

    sput-object v0, Lg7/d;->L:Lg7/d;

    invoke-static {}, Lg7/d;->e()[Lg7/d;

    move-result-object v0

    sput-object v0, Lg7/d;->M:[Lg7/d;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Lg7/d;->N:Lp7/a;

    new-instance v0, Lg7/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg7/d$a;-><init>(Ly7/k;)V

    sput-object v0, Lg7/d;->E:Lg7/d$a;

    invoke-static {}, Lg7/d;->g()Lp7/a;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_0

    move-object v4, v1

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    move-object v5, v4

    check-cast v5, Lg7/d;

    iget v5, v5, Lg7/d;->D:I

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lg7/d;

    iget v7, v7, Lg7/d;->D:I

    if-ge v5, v7, :cond_3

    move-object v4, v6

    move v5, v7

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_2

    :goto_0
    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v4, Lg7/d;

    iget v0, v4, Lg7/d;->D:I

    sput v0, Lg7/d;->F:I

    add-int/2addr v0, v3

    new-array v4, v0, [Lg7/d;

    move v5, v2

    :goto_1
    if-ge v5, v0, :cond_8

    invoke-static {}, Lg7/d;->g()Lp7/a;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move-object v8, v1

    move v7, v2

    :cond_4
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lg7/d;

    iget v10, v10, Lg7/d;->D:I

    if-ne v10, v5, :cond_4

    if-eqz v7, :cond_5

    :goto_3
    move-object v8, v1

    goto :goto_4

    :cond_5
    move v7, v3

    move-object v8, v9

    goto :goto_2

    :cond_6
    if-nez v7, :cond_7

    goto :goto_3

    :cond_7
    :goto_4
    aput-object v8, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_8
    sput-object v4, Lg7/d;->G:[Lg7/d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZI)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lg7/d;->C:Z

    iput p4, p0, Lg7/d;->D:I

    return-void
.end method

.method private static final synthetic e()[Lg7/d;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lg7/d;

    sget-object v1, Lg7/d;->H:Lg7/d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lg7/d;->I:Lg7/d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lg7/d;->J:Lg7/d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lg7/d;->K:Lg7/d;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lg7/d;->L:Lg7/d;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static g()Lp7/a;
    .locals 1

    sget-object v0, Lg7/d;->N:Lp7/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lg7/d;
    .locals 1

    const-class v0, Lg7/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg7/d;

    return-object p0
.end method

.method public static values()[Lg7/d;
    .locals 1

    sget-object v0, Lg7/d;->M:[Lg7/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg7/d;

    return-object v0
.end method
