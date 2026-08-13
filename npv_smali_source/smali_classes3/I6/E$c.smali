.class final LI6/E$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI6/S;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI6/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:Lx7/q;

.field private final b:LI6/S;


# direct methods
.method public constructor <init>(Lx7/q;LI6/S;)V
    .locals 1

    const-string v0, "interceptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextSender"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI6/E$c;->a:Lx7/q;

    iput-object p2, p0, LI6/E$c;->b:LI6/S;

    return-void
.end method


# virtual methods
.method public a(LO6/d;Lm7/e;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LI6/E$c;->a:Lx7/q;

    iget-object v1, p0, LI6/E$c;->b:LI6/S;

    invoke-interface {v0, v1, p1, p2}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
