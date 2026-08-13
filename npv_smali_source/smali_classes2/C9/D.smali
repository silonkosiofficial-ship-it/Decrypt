.class public final synthetic LC9/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic C:LC9/G;


# direct methods
.method public synthetic constructor <init>(LC9/G;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC9/D;->C:LC9/G;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LC9/D;->C:LC9/G;

    invoke-static {v0}, LC9/G;->b(LC9/G;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
