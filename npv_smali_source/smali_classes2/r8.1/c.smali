.class Lr8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG8/e$a;


# instance fields
.field private final a:Z

.field private final b:LO7/a;

.field private final c:LO7/a;


# direct methods
.method public constructor <init>(ZLO7/a;LO7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lr8/c;->a:Z

    iput-object p2, p0, Lr8/c;->b:LO7/a;

    iput-object p3, p0, Lr8/c;->c:LO7/a;

    return-void
.end method


# virtual methods
.method public a(LF8/e0;LF8/e0;)Z
    .locals 3

    iget-boolean v0, p0, Lr8/c;->a:Z

    iget-object v1, p0, Lr8/c;->b:LO7/a;

    iget-object v2, p0, Lr8/c;->c:LO7/a;

    invoke-static {v0, v1, v2, p1, p2}, Lr8/d;->a(ZLO7/a;LO7/a;LF8/e0;LF8/e0;)Z

    move-result p1

    return p1
.end method
