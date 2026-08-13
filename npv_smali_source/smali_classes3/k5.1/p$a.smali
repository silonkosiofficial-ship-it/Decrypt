.class Lk5/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk5/A$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk5/p;->w(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;Ls5/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lk5/p;


# direct methods
.method constructor <init>(Lk5/p;)V
    .locals 0

    iput-object p1, p0, Lk5/p$a;->a:Lk5/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ls5/j;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lk5/p$a;->a:Lk5/p;

    invoke-virtual {v0, p1, p2, p3}, Lk5/p;->G(Ls5/j;Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method
