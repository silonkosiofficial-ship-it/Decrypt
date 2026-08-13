.class public final LJ6/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LJ6/a;

.field private final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LJ6/a;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "hook"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ6/j;->a:LJ6/a;

    iput-object p2, p0, LJ6/j;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(LC6/c;)V
    .locals 2

    const-string v0, "client"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LJ6/j;->a:LJ6/a;

    iget-object v1, p0, LJ6/j;->b:Ljava/lang/Object;

    invoke-interface {v0, p1, v1}, LJ6/a;->a(LC6/c;Ljava/lang/Object;)V

    return-void
.end method
