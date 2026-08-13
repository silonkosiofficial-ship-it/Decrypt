.class public final synthetic Ll5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/c;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Callable;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Callable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll5/c;->a:Ljava/util/concurrent/Callable;

    return-void
.end method


# virtual methods
.method public final a(Ll4/l;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll5/c;->a:Ljava/util/concurrent/Callable;

    invoke-static {v0, p1}, Ll5/e;->c(Ljava/util/concurrent/Callable;Ll4/l;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
