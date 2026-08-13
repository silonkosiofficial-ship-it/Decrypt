.class public final LU/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU/q;

.field private static final b:Lu/z;

.field private static final c:Lu/z;

.field private static final d:Lu/z;

.field private static final e:Lu/z;

.field private static final f:Lu/z;

.field private static final g:Lu/z;

.field private static final h:Lu/z;

.field private static final i:Lu/z;

.field private static final j:Lu/z;

.field private static final k:Lu/z;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, LU/q;

    invoke-direct {v0}, LU/q;-><init>()V

    sput-object v0, LU/q;->a:LU/q;

    new-instance v0, Lu/z;

    const v1, 0x3e4ccccd    # 0.2f

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v2, v3}, Lu/z;-><init>(FFFF)V

    sput-object v0, LU/q;->b:Lu/z;

    new-instance v0, Lu/z;

    const v4, 0x3f4ccccd    # 0.8f

    const v5, 0x3e19999a    # 0.15f

    const v6, 0x3e99999a    # 0.3f

    invoke-direct {v0, v6, v2, v4, v5}, Lu/z;-><init>(FFFF)V

    sput-object v0, LU/q;->c:Lu/z;

    new-instance v0, Lu/z;

    const v4, 0x3f333333    # 0.7f

    const v5, 0x3dcccccd    # 0.1f

    const v7, 0x3d4ccccd    # 0.05f

    invoke-direct {v0, v7, v4, v5, v3}, Lu/z;-><init>(FFFF)V

    sput-object v0, LU/q;->d:Lu/z;

    new-instance v0, Lu/z;

    const v4, 0x3ecccccd    # 0.4f

    invoke-direct {v0, v4, v2, v1, v3}, Lu/z;-><init>(FFFF)V

    sput-object v0, LU/q;->e:Lu/z;

    new-instance v0, Lu/z;

    invoke-direct {v0, v4, v2, v3, v3}, Lu/z;-><init>(FFFF)V

    sput-object v0, LU/q;->f:Lu/z;

    new-instance v0, Lu/z;

    invoke-direct {v0, v2, v2, v1, v3}, Lu/z;-><init>(FFFF)V

    sput-object v0, LU/q;->g:Lu/z;

    new-instance v0, Lu/z;

    invoke-direct {v0, v2, v2, v3, v3}, Lu/z;-><init>(FFFF)V

    sput-object v0, LU/q;->h:Lu/z;

    new-instance v0, Lu/z;

    invoke-direct {v0, v1, v2, v2, v3}, Lu/z;-><init>(FFFF)V

    sput-object v0, LU/q;->i:Lu/z;

    new-instance v0, Lu/z;

    invoke-direct {v0, v6, v2, v3, v3}, Lu/z;-><init>(FFFF)V

    sput-object v0, LU/q;->j:Lu/z;

    new-instance v0, Lu/z;

    invoke-direct {v0, v2, v2, v2, v3}, Lu/z;-><init>(FFFF)V

    sput-object v0, LU/q;->k:Lu/z;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lu/z;
    .locals 1

    sget-object v0, LU/q;->d:Lu/z;

    return-object v0
.end method
