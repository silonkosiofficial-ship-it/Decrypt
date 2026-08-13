.class public final synthetic LC9/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:LC9/g;


# direct methods
.method public synthetic constructor <init>(LC9/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC9/m;->C:LC9/g;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LC9/m;->C:LC9/g;

    check-cast p1, LV/N;

    invoke-static {v0, p1}, LC9/p;->c(LC9/g;LV/N;)LV/M;

    move-result-object p1

    return-object p1
.end method
