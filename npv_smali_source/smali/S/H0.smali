.class public final LS/H0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/H0;

.field private static final b:LR/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LS/H0;

    invoke-direct {v0}, LS/H0;-><init>()V

    sput-object v0, LS/H0;->a:LS/H0;

    new-instance v0, LR/g;

    const v1, 0x3dcccccd    # 0.1f

    const v2, 0x3da3d70a    # 0.08f

    const v3, 0x3e23d70a    # 0.16f

    invoke-direct {v0, v3, v1, v2, v1}, LR/g;-><init>(FFFF)V

    sput-object v0, LS/H0;->b:LR/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LR/g;
    .locals 1

    sget-object v0, LS/H0;->b:LR/g;

    return-object v0
.end method
