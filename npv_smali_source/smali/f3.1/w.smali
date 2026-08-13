.class public final Lf3/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/b;


# instance fields
.field private final a:Lh7/a;

.field private final b:Lh7/a;

.field private final c:Lh7/a;

.field private final d:Lh7/a;


# direct methods
.method public constructor <init>(Lh7/a;Lh7/a;Lh7/a;Lh7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf3/w;->a:Lh7/a;

    iput-object p2, p0, Lf3/w;->b:Lh7/a;

    iput-object p3, p0, Lf3/w;->c:Lh7/a;

    iput-object p4, p0, Lf3/w;->d:Lh7/a;

    return-void
.end method

.method public static a(Lh7/a;Lh7/a;Lh7/a;Lh7/a;)Lf3/w;
    .locals 1

    new-instance v0, Lf3/w;

    invoke-direct {v0, p0, p1, p2, p3}, Lf3/w;-><init>(Lh7/a;Lh7/a;Lh7/a;Lh7/a;)V

    return-object v0
.end method

.method public static c(Ljava/util/concurrent/Executor;Lg3/d;Lf3/x;Lh3/b;)Lf3/v;
    .locals 1

    new-instance v0, Lf3/v;

    invoke-direct {v0, p0, p1, p2, p3}, Lf3/v;-><init>(Ljava/util/concurrent/Executor;Lg3/d;Lf3/x;Lh3/b;)V

    return-object v0
.end method


# virtual methods
.method public b()Lf3/v;
    .locals 4

    iget-object v0, p0, Lf3/w;->a:Lh7/a;

    invoke-interface {v0}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lf3/w;->b:Lh7/a;

    invoke-interface {v1}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg3/d;

    iget-object v2, p0, Lf3/w;->c:Lh7/a;

    invoke-interface {v2}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf3/x;

    iget-object v3, p0, Lf3/w;->d:Lh7/a;

    invoke-interface {v3}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh3/b;

    invoke-static {v0, v1, v2, v3}, Lf3/w;->c(Ljava/util/concurrent/Executor;Lg3/d;Lf3/x;Lh3/b;)Lf3/v;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lf3/w;->b()Lf3/v;

    move-result-object v0

    return-object v0
.end method
