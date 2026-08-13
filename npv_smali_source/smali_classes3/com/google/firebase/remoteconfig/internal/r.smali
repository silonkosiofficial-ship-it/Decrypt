.class public final synthetic Lcom/google/firebase/remoteconfig/internal/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/c;


# instance fields
.field public final synthetic a:Lcom/google/firebase/remoteconfig/internal/t;

.field public final synthetic b:Ll4/l;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/remoteconfig/internal/t;Ll4/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/internal/r;->a:Lcom/google/firebase/remoteconfig/internal/t;

    iput-object p2, p0, Lcom/google/firebase/remoteconfig/internal/r;->b:Ll4/l;

    return-void
.end method


# virtual methods
.method public final a(Ll4/l;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/r;->a:Lcom/google/firebase/remoteconfig/internal/t;

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/internal/r;->b:Ll4/l;

    invoke-static {v0, v1, p1}, Lcom/google/firebase/remoteconfig/internal/t;->a(Lcom/google/firebase/remoteconfig/internal/t;Ll4/l;Ll4/l;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
