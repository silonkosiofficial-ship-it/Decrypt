.class public final LK0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LF0/J;

.field private final b:LK0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LF0/J;LK0/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK0/q;->a:LF0/J;

    iput-object p2, p0, LK0/q;->b:LK0/e;

    return-void
.end method


# virtual methods
.method public final a()LK0/o;
    .locals 5

    iget-object v0, p0, LK0/q;->b:LK0/e;

    iget-object v1, p0, LK0/q;->a:LF0/J;

    new-instance v2, LK0/k;

    invoke-direct {v2}, LK0/k;-><init>()V

    new-instance v3, LK0/o;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4, v1, v2}, LK0/o;-><init>(Landroidx/compose/ui/d$c;ZLF0/J;LK0/k;)V

    return-object v3
.end method
