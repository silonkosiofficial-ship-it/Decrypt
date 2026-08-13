.class public final synthetic Lf3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/b$a;


# instance fields
.field public final synthetic a:Lg3/d;


# direct methods
.method public synthetic constructor <init>(Lg3/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf3/i;->a:Lg3/d;

    return-void
.end method


# virtual methods
.method public final n()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf3/i;->a:Lg3/d;

    invoke-interface {v0}, Lg3/d;->v()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
