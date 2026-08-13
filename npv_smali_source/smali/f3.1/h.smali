.class public final synthetic Lf3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/b$a;


# instance fields
.field public final synthetic a:Lg3/c;


# direct methods
.method public synthetic constructor <init>(Lg3/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf3/h;->a:Lg3/c;

    return-void
.end method


# virtual methods
.method public final n()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf3/h;->a:Lg3/c;

    invoke-interface {v0}, Lg3/c;->g()Lb3/a;

    move-result-object v0

    return-object v0
.end method
