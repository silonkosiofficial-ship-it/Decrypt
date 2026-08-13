.class final Ll4/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/i;


# instance fields
.field final synthetic a:Ll4/m;


# direct methods
.method constructor <init>(Ll4/m;)V
    .locals 0

    iput-object p1, p0, Ll4/M;->a:Ll4/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    iget-object v0, p0, Ll4/M;->a:Ll4/m;

    invoke-static {v0}, Ll4/m;->f(Ll4/m;)Ll4/P;

    move-result-object v0

    invoke-virtual {v0}, Ll4/P;->t()Z

    return-void
.end method
