.class public final LW6/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LW6/w;

.field private static final b:Z

.field private static final c:Z

.field private static final d:Z

.field private static final e:Z

.field private static final f:Z

.field private static final g:Z

.field private static final h:Z

.field private static final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LW6/w;

    invoke-direct {v0}, LW6/w;-><init>()V

    sput-object v0, LW6/w;->a:LW6/w;

    invoke-static {v0}, LW6/x;->a(LW6/w;)LW6/v;

    const/4 v1, 0x0

    sput-boolean v1, LW6/w;->b:Z

    invoke-static {v0}, LW6/x;->a(LW6/w;)LW6/v;

    sput-boolean v1, LW6/w;->c:Z

    invoke-static {v0}, LW6/x;->a(LW6/w;)LW6/v;

    sput-boolean v1, LW6/w;->d:Z

    invoke-static {v0}, LW6/x;->a(LW6/w;)LW6/v;

    sput-boolean v1, LW6/w;->e:Z

    invoke-static {v0}, LW6/x;->a(LW6/w;)LW6/v;

    move-result-object v1

    sget-object v2, LW6/v$a;->a:LW6/v$a;

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    sput-boolean v1, LW6/w;->f:Z

    invoke-static {v0}, LW6/x;->a(LW6/w;)LW6/v;

    move-result-object v1

    sget-object v2, LW6/v$b;->a:LW6/v$b;

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    sput-boolean v1, LW6/w;->g:Z

    invoke-static {v0}, LW6/x;->b(LW6/w;)Z

    move-result v1

    sput-boolean v1, LW6/w;->h:Z

    invoke-static {v0}, LW6/x;->c(LW6/w;)Z

    move-result v0

    sput-boolean v0, LW6/w;->i:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    sget-boolean v0, LW6/w;->b:Z

    return v0
.end method

.method public final b()Z
    .locals 1

    sget-boolean v0, LW6/w;->h:Z

    return v0
.end method
