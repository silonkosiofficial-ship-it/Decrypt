.class final Li7/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Li7/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li7/m;

    invoke-direct {v0}, Li7/m;-><init>()V

    sput-object v0, Li7/m;->a:Li7/m;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Li7/l;
    .locals 4

    new-instance v0, Li7/l;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v3, v1, v2}, Li7/l;-><init>(III)V

    return-object v0
.end method
