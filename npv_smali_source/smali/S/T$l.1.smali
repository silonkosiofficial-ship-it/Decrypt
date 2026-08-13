.class final LS/T$l;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->c(Ljava/lang/Long;JLx7/l;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/w0;


# direct methods
.method constructor <init>(LV/w0;)V
    .locals 0

    iput-object p1, p0, LS/T$l;->D:LV/w0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LS/T$l;->D:LV/w0;

    invoke-static {v0}, LS/T;->r(LV/w0;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, LS/T;->s(LV/w0;Z)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS/T$l;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
