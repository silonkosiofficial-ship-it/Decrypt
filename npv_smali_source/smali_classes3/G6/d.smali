.class public final LG6/d;
.super LF6/j;
.source "SourceFile"


# instance fields
.field private d:Lx7/l;

.field private e:LH9/x;

.field private f:I

.field private g:LH9/F$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LF6/j;-><init>()V

    new-instance v0, LG6/c;

    invoke-direct {v0}, LG6/c;-><init>()V

    iput-object v0, p0, LG6/d;->d:Lx7/l;

    const/16 v0, 0xa

    iput v0, p0, LG6/d;->f:I

    return-void
.end method

.method public static synthetic d(LH9/x$a;)Li7/M;
    .locals 0

    invoke-static {p0}, LG6/d;->e(LH9/x$a;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private static final e(LH9/x$a;)Li7/M;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LH9/x$a;->e(Z)LH9/x$a;

    invoke-virtual {p0, v0}, LH9/x$a;->f(Z)LH9/x$a;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LH9/x$a;->N(Z)LH9/x$a;

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method


# virtual methods
.method public final f()I
    .locals 1

    iget v0, p0, LG6/d;->f:I

    return v0
.end method

.method public final g()Lx7/l;
    .locals 1

    iget-object v0, p0, LG6/d;->d:Lx7/l;

    return-object v0
.end method

.method public final h()LH9/x;
    .locals 1

    iget-object v0, p0, LG6/d;->e:LH9/x;

    return-object v0
.end method

.method public final i()LH9/F$a;
    .locals 1

    iget-object v0, p0, LG6/d;->g:LH9/F$a;

    return-object v0
.end method
