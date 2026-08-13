.class public final Lx9/L;
.super Lx9/S;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lv9/f;Lv9/f;)V
    .locals 2

    const-string v0, "keyDesc"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueDesc"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlin.collections.LinkedHashMap"

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, p2, v1}, Lx9/S;-><init>(Ljava/lang/String;Lv9/f;Lv9/f;Ly7/k;)V

    return-void
.end method
