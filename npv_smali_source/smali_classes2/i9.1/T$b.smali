.class final Li9/T$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li9/T;->i(Li9/o;Li9/S;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Li9/S;


# direct methods
.method constructor <init>(Li9/S;)V
    .locals 0

    iput-object p1, p0, Li9/T$b;->D:Li9/S;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Li9/o;)V
    .locals 1

    const-string v0, "$this$alternativeParsing"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li9/T$b;->D:Li9/S;

    check-cast v0, Li9/S$c;

    invoke-virtual {v0}, Li9/S$c;->a()Li9/S;

    move-result-object v0

    invoke-static {p1, v0}, Li9/T;->a(Li9/o;Li9/S;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li9/o;

    invoke-virtual {p0, p1}, Li9/T$b;->a(Li9/o;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
