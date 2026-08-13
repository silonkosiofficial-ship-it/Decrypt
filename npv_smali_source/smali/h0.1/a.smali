.class public final Lh0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lh0/a;

.field private static final b:Lh0/c;

.field private static final c:Lh0/c;

.field private static final d:Lh0/c;

.field private static final e:Lh0/c;

.field private static final f:Lh0/c;

.field private static final g:Lh0/c;

.field private static final h:Lh0/c$b;

.field private static final i:Lh0/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lh0/a;

    invoke-direct {v0}, Lh0/a;-><init>()V

    sput-object v0, Lh0/a;->a:Lh0/a;

    new-instance v0, Lh0/d;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-direct {v0, v1, v1}, Lh0/d;-><init>(FF)V

    sput-object v0, Lh0/a;->b:Lh0/c;

    new-instance v0, Lh0/d;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v2, v1}, Lh0/d;-><init>(FF)V

    sput-object v0, Lh0/a;->c:Lh0/c;

    new-instance v0, Lh0/d;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3}, Lh0/d;-><init>(FF)V

    sput-object v0, Lh0/a;->d:Lh0/c;

    new-instance v0, Lh0/d;

    invoke-direct {v0, v2, v3}, Lh0/d;-><init>(FF)V

    sput-object v0, Lh0/a;->e:Lh0/c;

    new-instance v0, Lh0/d;

    invoke-direct {v0, v1, v2}, Lh0/d;-><init>(FF)V

    sput-object v0, Lh0/a;->f:Lh0/c;

    new-instance v0, Lh0/d;

    invoke-direct {v0, v2, v2}, Lh0/d;-><init>(FF)V

    sput-object v0, Lh0/a;->g:Lh0/c;

    new-instance v0, Lh0/d$a;

    invoke-direct {v0, v1}, Lh0/d$a;-><init>(F)V

    sput-object v0, Lh0/a;->h:Lh0/c$b;

    new-instance v0, Lh0/d$a;

    invoke-direct {v0, v2}, Lh0/d$a;-><init>(F)V

    sput-object v0, Lh0/a;->i:Lh0/c$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lh0/c$b;
    .locals 1

    sget-object v0, Lh0/a;->h:Lh0/c$b;

    return-object v0
.end method

.method public final b()Lh0/c$b;
    .locals 1

    sget-object v0, Lh0/a;->i:Lh0/c$b;

    return-object v0
.end method

.method public final c()Lh0/c;
    .locals 1

    sget-object v0, Lh0/a;->b:Lh0/c;

    return-object v0
.end method

.method public final d()Lh0/c;
    .locals 1

    sget-object v0, Lh0/a;->c:Lh0/c;

    return-object v0
.end method
