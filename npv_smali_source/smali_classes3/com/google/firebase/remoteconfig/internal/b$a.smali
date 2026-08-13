.class Lcom/google/firebase/remoteconfig/internal/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/remoteconfig/internal/b;->b(IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:I

.field final synthetic D:J

.field final synthetic E:Lcom/google/firebase/remoteconfig/internal/b;


# direct methods
.method constructor <init>(Lcom/google/firebase/remoteconfig/internal/b;IJ)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/internal/b$a;->E:Lcom/google/firebase/remoteconfig/internal/b;

    iput p2, p0, Lcom/google/firebase/remoteconfig/internal/b$a;->C:I

    iput-wide p3, p0, Lcom/google/firebase/remoteconfig/internal/b$a;->D:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/b$a;->E:Lcom/google/firebase/remoteconfig/internal/b;

    iget v1, p0, Lcom/google/firebase/remoteconfig/internal/b$a;->C:I

    iget-wide v2, p0, Lcom/google/firebase/remoteconfig/internal/b$a;->D:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/firebase/remoteconfig/internal/b;->d(IJ)Ll4/l;

    return-void
.end method
