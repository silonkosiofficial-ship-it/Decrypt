.class public final Le3/i;
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

    iput-object p1, p0, Le3/i;->a:Lh7/a;

    iput-object p2, p0, Le3/i;->b:Lh7/a;

    iput-object p3, p0, Le3/i;->c:Lh7/a;

    iput-object p4, p0, Le3/i;->d:Lh7/a;

    return-void
.end method

.method public static a(Lh7/a;Lh7/a;Lh7/a;Lh7/a;)Le3/i;
    .locals 1

    new-instance v0, Le3/i;

    invoke-direct {v0, p0, p1, p2, p3}, Le3/i;-><init>(Lh7/a;Lh7/a;Lh7/a;Lh7/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lg3/d;Lf3/f;Li3/a;)Lf3/x;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Le3/h;->a(Landroid/content/Context;Lg3/d;Lf3/f;Li3/a;)Lf3/x;

    move-result-object p0

    invoke-static {p0}, La3/d;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lf3/x;

    return-object p0
.end method


# virtual methods
.method public b()Lf3/x;
    .locals 4

    iget-object v0, p0, Le3/i;->a:Lh7/a;

    invoke-interface {v0}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Le3/i;->b:Lh7/a;

    invoke-interface {v1}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg3/d;

    iget-object v2, p0, Le3/i;->c:Lh7/a;

    invoke-interface {v2}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf3/f;

    iget-object v3, p0, Le3/i;->d:Lh7/a;

    invoke-interface {v3}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li3/a;

    invoke-static {v0, v1, v2, v3}, Le3/i;->c(Landroid/content/Context;Lg3/d;Lf3/f;Li3/a;)Lf3/x;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Le3/i;->b()Lf3/x;

    move-result-object v0

    return-object v0
.end method
