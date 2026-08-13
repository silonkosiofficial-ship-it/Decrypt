.class public final enum LX7/I$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX7/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum E:LX7/I$b;

.field public static final enum F:LX7/I$b;

.field public static final enum G:LX7/I$b;

.field private static final synthetic H:[LX7/I$b;

.field private static final synthetic I:Lp7/a;


# instance fields
.field private final C:Ljava/lang/String;

.field private final D:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LX7/I$b;

    const/4 v1, 0x0

    const-string v2, "Ljava/util/Collection<+Ljava/lang/Object;>;"

    const-string v3, "ONE_COLLECTION_PARAMETER"

    invoke-direct {v0, v3, v1, v2, v1}, LX7/I$b;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, LX7/I$b;->E:LX7/I$b;

    new-instance v0, LX7/I$b;

    const/4 v1, 0x0

    const-string v2, "OBJECT_PARAMETER_NON_GENERIC"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1, v3}, LX7/I$b;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, LX7/I$b;->F:LX7/I$b;

    new-instance v0, LX7/I$b;

    const/4 v1, 0x2

    const-string v2, "Ljava/lang/Object;"

    const-string v4, "OBJECT_PARAMETER_GENERIC"

    invoke-direct {v0, v4, v1, v2, v3}, LX7/I$b;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, LX7/I$b;->G:LX7/I$b;

    invoke-static {}, LX7/I$b;->e()[LX7/I$b;

    move-result-object v0

    sput-object v0, LX7/I$b;->H:[LX7/I$b;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LX7/I$b;->I:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LX7/I$b;->C:Ljava/lang/String;

    iput-boolean p4, p0, LX7/I$b;->D:Z

    return-void
.end method

.method private static final synthetic e()[LX7/I$b;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LX7/I$b;

    sget-object v1, LX7/I$b;->E:LX7/I$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LX7/I$b;->F:LX7/I$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LX7/I$b;->G:LX7/I$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LX7/I$b;
    .locals 1

    const-class v0, LX7/I$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LX7/I$b;

    return-object p0
.end method

.method public static values()[LX7/I$b;
    .locals 1

    sget-object v0, LX7/I$b;->H:[LX7/I$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LX7/I$b;

    return-object v0
.end method
