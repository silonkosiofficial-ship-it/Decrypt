.class public final Lq8/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lq8/h;

.field private static final b:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lq8/h;

    invoke-direct {v0}, Lq8/h;-><init>()V

    sput-object v0, Lq8/h;->a:Lq8/h;

    new-instance v0, Ln8/c;

    const-string v1, "kotlin.internal.NoInfer"

    invoke-direct {v0, v1}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v1, Ln8/c;

    const-string v2, "kotlin.internal.Exact"

    invoke-direct {v1, v2}, Ln8/c;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x2

    new-array v2, v2, [Ln8/c;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lq8/h;->b:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1

    sget-object v0, Lq8/h;->b:Ljava/util/Set;

    return-object v0
.end method
