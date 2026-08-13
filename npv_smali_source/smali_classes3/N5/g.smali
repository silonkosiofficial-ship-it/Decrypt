.class public final synthetic LN5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/c;


# instance fields
.field public final synthetic a:Lcom/google/firebase/remoteconfig/a;

.field public final synthetic b:Ll4/l;

.field public final synthetic c:Ll4/l;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/remoteconfig/a;Ll4/l;Ll4/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN5/g;->a:Lcom/google/firebase/remoteconfig/a;

    iput-object p2, p0, LN5/g;->b:Ll4/l;

    iput-object p3, p0, LN5/g;->c:Ll4/l;

    return-void
.end method


# virtual methods
.method public final a(Ll4/l;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LN5/g;->a:Lcom/google/firebase/remoteconfig/a;

    iget-object v1, p0, LN5/g;->b:Ll4/l;

    iget-object v2, p0, LN5/g;->c:Ll4/l;

    invoke-static {v0, v1, v2, p1}, Lcom/google/firebase/remoteconfig/a;->f(Lcom/google/firebase/remoteconfig/a;Ll4/l;Ll4/l;Ll4/l;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
