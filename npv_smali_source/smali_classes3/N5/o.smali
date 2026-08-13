.class public final synthetic LN5/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV3/d;


# instance fields
.field public final synthetic a:Lcom/google/firebase/remoteconfig/internal/v;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/remoteconfig/internal/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN5/o;->a:Lcom/google/firebase/remoteconfig/internal/v;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LN5/o;->a:Lcom/google/firebase/remoteconfig/internal/v;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lcom/google/firebase/remoteconfig/internal/g;

    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/remoteconfig/internal/v;->a(Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/g;)V

    return-void
.end method
