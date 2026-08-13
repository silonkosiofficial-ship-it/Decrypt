.class public final synthetic Ll5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/c;


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll5/d;->a:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final a(Ll4/l;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll5/d;->a:Ljava/lang/Runnable;

    invoke-static {v0, p1}, Ll5/e;->b(Ljava/lang/Runnable;Ll4/l;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
