.class public final LS6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LX6/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LX6/a;

    invoke-direct {v0}, LX6/a;-><init>()V

    iput-object v0, p0, LS6/b;->a:LX6/a;

    return-void
.end method


# virtual methods
.method public final a(LS6/a;Ljava/lang/Object;)V
    .locals 0

    const-string p2, "definition"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LS6/b;->a:LX6/a;

    invoke-virtual {p2, p1}, LX6/a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    return-void
.end method
