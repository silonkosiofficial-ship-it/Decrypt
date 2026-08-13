.class public abstract Lo2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo2/s;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo2/r$a;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "identityHash"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "legacyIdentityHash"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lo2/r;->a:I

    iput-object p2, p0, Lo2/r;->b:Ljava/lang/String;

    iput-object p3, p0, Lo2/r;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract a(Ly2/b;)V
.end method

.method public abstract b(Ly2/b;)V
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo2/r;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo2/r;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lo2/r;->a:I

    return v0
.end method

.method public abstract f(Ly2/b;)V
.end method

.method public abstract g(Ly2/b;)V
.end method

.method public abstract h(Ly2/b;)V
.end method

.method public abstract i(Ly2/b;)V
.end method

.method public abstract j(Ly2/b;)Lo2/r$a;
.end method
