.class public final synthetic Lcom/google/firebase/remoteconfig/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/c;


# instance fields
.field public final synthetic a:Lcom/google/firebase/remoteconfig/internal/b;

.field public final synthetic b:Ll4/l;

.field public final synthetic c:Ll4/l;

.field public final synthetic d:J

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/remoteconfig/internal/b;Ll4/l;Ll4/l;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/internal/a;->a:Lcom/google/firebase/remoteconfig/internal/b;

    iput-object p2, p0, Lcom/google/firebase/remoteconfig/internal/a;->b:Ll4/l;

    iput-object p3, p0, Lcom/google/firebase/remoteconfig/internal/a;->c:Ll4/l;

    iput-wide p4, p0, Lcom/google/firebase/remoteconfig/internal/a;->d:J

    iput p6, p0, Lcom/google/firebase/remoteconfig/internal/a;->e:I

    return-void
.end method


# virtual methods
.method public final a(Ll4/l;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/a;->a:Lcom/google/firebase/remoteconfig/internal/b;

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/internal/a;->b:Ll4/l;

    iget-object v2, p0, Lcom/google/firebase/remoteconfig/internal/a;->c:Ll4/l;

    iget-wide v3, p0, Lcom/google/firebase/remoteconfig/internal/a;->d:J

    iget v5, p0, Lcom/google/firebase/remoteconfig/internal/a;->e:I

    move-object v6, p1

    invoke-static/range {v0 .. v6}, Lcom/google/firebase/remoteconfig/internal/b;->a(Lcom/google/firebase/remoteconfig/internal/b;Ll4/l;Ll4/l;JILl4/l;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
