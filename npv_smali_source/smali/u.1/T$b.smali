.class final Lu/T$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/T;->b(Lu/S;Ljava/lang/Object;Ljava/lang/Object;Lu/x0;Lu/Q;Ljava/lang/String;LV/n;II)LV/G1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lu/S;

.field final synthetic E:Lu/S$a;


# direct methods
.method constructor <init>(Lu/S;Lu/S$a;)V
    .locals 0

    iput-object p1, p0, Lu/T$b;->D:Lu/S;

    iput-object p2, p0, Lu/T$b;->E:Lu/S$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/N;)LV/M;
    .locals 2

    iget-object p1, p0, Lu/T$b;->D:Lu/S;

    iget-object v0, p0, Lu/T$b;->E:Lu/S$a;

    invoke-virtual {p1, v0}, Lu/S;->f(Lu/S$a;)V

    iget-object p1, p0, Lu/T$b;->D:Lu/S;

    iget-object v0, p0, Lu/T$b;->E:Lu/S$a;

    new-instance v1, Lu/T$b$a;

    invoke-direct {v1, p1, v0}, Lu/T$b$a;-><init>(Lu/S;Lu/S$a;)V

    return-object v1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/N;

    invoke-virtual {p0, p1}, Lu/T$b;->a(LV/N;)LV/M;

    move-result-object p1

    return-object p1
.end method
