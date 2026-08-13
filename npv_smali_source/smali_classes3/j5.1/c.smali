.class public Lj5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj5/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lj5/a;)V
    .locals 1

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string v0, "Could not register handler for breadcrumbs events."

    invoke-virtual {p1, v0}, Lh5/g;->b(Ljava/lang/String;)V

    return-void
.end method
