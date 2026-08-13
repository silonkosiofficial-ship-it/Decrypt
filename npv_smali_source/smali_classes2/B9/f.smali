.class public final LB9/f;
.super Landroidx/lifecycle/T;
.source "SourceFile"

# interfaces
.implements LF9/b;


# instance fields
.field private final b:Li7/n;

.field private final c:Le/w;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/T;-><init>()V

    new-instance v0, LB9/e;

    invoke-direct {v0}, LB9/e;-><init>()V

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    iput-object v0, p0, LB9/f;->b:Li7/n;

    new-instance v0, LB9/f$a;

    invoke-direct {v0, p0}, LB9/f$a;-><init>(LB9/f;)V

    iput-object v0, p0, LB9/f;->c:Le/w;

    return-void
.end method

.method public static synthetic h()LF9/a;
    .locals 1

    invoke-static {}, LB9/f;->i()LF9/a;

    move-result-object v0

    return-object v0
.end method

.method private static final i()LF9/a;
    .locals 1

    new-instance v0, LF9/a;

    invoke-direct {v0}, LF9/a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public c()LF9/a;
    .locals 1

    iget-object v0, p0, LB9/f;->b:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF9/a;

    return-object v0
.end method

.method public final j()Le/w;
    .locals 1

    iget-object v0, p0, LB9/f;->c:Le/w;

    return-object v0
.end method
