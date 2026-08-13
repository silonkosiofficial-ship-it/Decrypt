.class Lk5/E$a$a;
.super Lk5/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk5/E$a;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:Ljava/lang/Runnable;

.field final synthetic D:Lk5/E$a;


# direct methods
.method constructor <init>(Lk5/E$a;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lk5/E$a$a;->D:Lk5/E$a;

    iput-object p2, p0, Lk5/E$a$a;->C:Ljava/lang/Runnable;

    invoke-direct {p0}, Lk5/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lk5/E$a$a;->C:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
