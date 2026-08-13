.class public final Lf1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lf1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf1/a;

    invoke-direct {v0}, Lf1/a;-><init>()V

    sput-object v0, Lf1/a;->a:Lf1/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(D)D
    .locals 2

    const-wide v0, 0x3f91df46a2529d39L    # 0.017453292519943295

    mul-double/2addr p1, v0

    return-wide p1
.end method
