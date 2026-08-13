.class public final Lh2/y$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh2/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field private final a:Lh2/z;

.field final synthetic b:Lh2/y;


# direct methods
.method public constructor <init>(Lh2/y;Lh2/z;)V
    .locals 1

    const-string v0, "pageFetcherSnapshot"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lh2/y$b;->b:Lh2/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lh2/y$b;->a:Lh2/z;

    return-void
.end method


# virtual methods
.method public a(Lh2/Z;)V
    .locals 1

    const-string v0, "viewportHint"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh2/y$b;->a:Lh2/z;

    invoke-virtual {v0, p1}, Lh2/z;->o(Lh2/Z;)V

    return-void
.end method
